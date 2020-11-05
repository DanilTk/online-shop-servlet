<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Set" %><%--
  Created by IntelliJ IDEA.
  User: DT
  Date: 10-Jan-20
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Summary</title>
</head>
<body>
<h1>Login Form</h1>
<% Set<String> products = (Set) request.getAttribute("Products"); %>

<%
    Iterator<String> iterator = products.iterator();
    String product = null;
    while (iterator.hasNext()) {
        product = (String) iterator.next();
    }
%>

<tr>
    <td><%=product%>
    </td>
</tr>

</body>
</html>
