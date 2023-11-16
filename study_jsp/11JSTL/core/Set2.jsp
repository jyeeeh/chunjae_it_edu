<%@ page import="common.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Vector" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL - set 2</title>
</head>
<body>
    <h4>List 컬렉션 이용하기</h4>
    <%
        ArrayList<Person> pList = new ArrayList<Person>();
        pList.add(new Person("성삼문",55));
        pList.add(new Person("박팽년",60));
    %>
    <%-- request영역에 personList 라는 변수명으로 저장 --%>
<%--    <c:set var="personList" value="<%= pList%>" scope="request"/>--%>
<%--    <ul>--%>
<%--        <li>이름 : ${ requestScope.personMap.personArg2.name }</li>--%>
<%--        <li>나이 : ${ personMap.personArg2.age }</li>--%>
<%--    </ul>--%>
</body>
</html>
