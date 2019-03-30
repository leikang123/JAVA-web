<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
欢迎来到传智播客，当前的时间是：
<%= new java.util.Date().toString() %>
<jsp:forward page="c.jsp"/>

</body>
</html>