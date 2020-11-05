package servlet;

import validation.CredentialsValidator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("login");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();
        try {
            if (CredentialsValidator.isLoginCorrect(name)
                    && CredentialsValidator.isPasswordCorrect(password)) {

                HttpSession session = request.getSession(true);
                session.setAttribute("login", name);

                response.sendRedirect("basket.jsp");
            } else {
                writer.append("Incorrect login and / or password\n");
            }
        } finally {
            writer.close();
        }

    }
}
