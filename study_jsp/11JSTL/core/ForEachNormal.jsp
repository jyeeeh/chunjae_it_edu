<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL - forEach 1</title>
    <style>
        table, tr, td{
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <h4>일반 for문 형태의 forEach 태그</h4>
    <%-- 1부터 3까지 반복하며 1씩 증가 --%>
    <c:forEach begin="1" end="3" step="1" var="i">
        <p>반복 ${i}입니다</p>
    </c:forEach>

    <h4>varStatus 속성 살펴보기</h4>
    <table>
    <%-- 속성값(상태를 알려줄 변수명) : "loop"
         일반 for문에서는 index와 current 값이 동일함--%>
    <c:forEach begin="3" end="5" var="i" varStatus="loop">
        <tr>
            <td>count : ${loop.count}</td>
            <td>index: ${loop.index}</td>
            <td>current: ${loop.current}</td>
            <td>first: ${loop.first}</td>
            <td>last: ${loop.last}</td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
