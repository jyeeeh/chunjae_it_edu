<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>RESTful 웹 서비스</title>
</head>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
    //url 가변적으로 변경
    //json 타입
    //문자열로 보내고 json으로 받아야함 JSON.stringify << 중요
    var obj = {"name" : "jyeeeh",  "age" : 10};

    function test(){
        $.ajax({
            url : "<c:url value="/test"/>",
            type : "post",
            data : JSON.stringify(obj),
            dataType : "json",
            contentType : "application/json",

            success : function(data){
                alert("성공" );
            },
            error:function(errorThrown){

                alert("실패");
            }

        });
    }

</script>
<body>
<h3>RESTful 웹 서비스</h3>
<button onclick="test()" type="button">실행</button>

</body>
<html>