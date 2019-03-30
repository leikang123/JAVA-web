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
pageContext.setAttribute("company", "杭州立昂微电子",pageContext.PAGE_SCOPE);
Object name=pageContext.getAttribute("company",pageContext.PAGE_SCOPE);
out.print("公司名为："+name);
%>
</body>
</html>