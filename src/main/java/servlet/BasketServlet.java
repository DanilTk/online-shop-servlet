package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class BasketServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String beef = request.getParameter("beef");
        String tomato = request.getParameter("tomato");
        String potato = request.getParameter("potato");
        String cucumber = request.getParameter("cucumber");
        String onion = request.getParameter("onion");

        Set<String> products = new HashSet<>();
        products.add(beef);
        products.add(tomato);
        products.add(potato);
        products.add(cucumber);
        products.add(onion);
        products = products.stream().filter(Objects::nonNull).collect(Collectors.toSet());

        request.setAttribute("Products", products);
        request.getRequestDispatcher("summary.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        String login = (String) session.getAttribute("login");

        if (login != null) {

            response.sendRedirect("basket.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}
