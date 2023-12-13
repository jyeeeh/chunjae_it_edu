<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-12-13
  Time: 오전 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/todo/register" method="post">
        <div>
            <input type="text" name="title" placeholder="insert title">
        </div>
        <div>
            <input type="date" name="dueDate">
        </div>
        <div>
            <button type="reset">reset</button>
            <button type="submit">register</button>
        </div>
    </form>
</body>
</html>
