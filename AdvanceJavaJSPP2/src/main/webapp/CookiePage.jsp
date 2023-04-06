<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Cookie ck[]=request.getCookies();
out.println("Getting the Cookie Value is::"+ck[0].getValue());
out.println("Getting the Cookie name is::"+ck[0].getName());

%>
</body>
</html>