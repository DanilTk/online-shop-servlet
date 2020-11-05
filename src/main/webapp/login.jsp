<%--
  Created by IntelliJ IDEA.
  User: DT
  Date: 10-Jan-20
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<div class="container col-md-8 col-md-offset-3" style="overflow: auto">
    <h1>Login Form</h1>
    <form action="<%=request.getContextPath()%>/login" method="post">

        <div class="form-group">
            <div>User Name:</div>
            <input type="text" class="form-control"
                   placeholder="User Name" name="login">
        </div>

        <div class="form-group">
            <div>Password:</div>
            <input type="password" class="form-control"
                   placeholder="Password" name="password">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
