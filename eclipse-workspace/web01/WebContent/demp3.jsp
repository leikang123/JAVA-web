<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
HttpServletRequest req =(HttpServletRequest) pageContext.getRequest();
String url = request.getRemoteAddr();
out.print(url);
%>
</body>
</html>