<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<form action="<%=request.getContextPath()%>/basket" method="post">
    <p>Choose your products:</p>
    <div>
        <input type="checkbox" name="tomato" value="tomato">
        <div>Tomato</div>
    </div>

    <div>
        <input type="checkbox" name="onion" value="onion">
        <div>Onion</div>
    </div>

    <div>
        <input type="checkbox" name="potato" value="potato">
        <div>Potato</div>
    </div>

    <div>
        <input type="checkbox" name="cucumber" value="cucumber">
        <div>Cucumber</div>
    </div>

    <div>
        <input type="checkbox" name="beef" value="beef">
        <div>Beef</div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
