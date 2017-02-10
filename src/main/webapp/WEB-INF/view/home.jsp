<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> <center> shoppingcart </center> </h2>
<center>${msg}</center>
<hr>
<a href="login">login</a><br>
<a href="registration">registration</a>
<c:if test ="$(isuserclickedlogin==true)">
    <jsp:include page="login.jsp"></jsp:include>
</c:if>  
<c:if test ="$(isuserclickedregistration==true)">
    <jsp:include page="registration.jsp"></jsp:include>
</c:if>   
</body>
</html>