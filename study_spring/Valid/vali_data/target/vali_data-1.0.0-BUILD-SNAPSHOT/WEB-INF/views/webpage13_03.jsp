<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validation</title>
</head>
<body>
    <h3>유효성검사</h3>
    <form:form modelAttribute="person" method="post">
        <p>이름 : <form:input path="name"/> <form:errors path="name"/>
        <p>나이 : <form:input path="age"/> <form:errors path="age"/>
        <p>이메일 : <form:input path="email"/> <form:errors path="email"/>

    <p><input type="submit" value="확인"/>
    </form:form>
</body>
</html>
