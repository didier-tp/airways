<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>statut Resa</title>
</head>
<body>
	<%@include file="header.jsp"%>
	Resa effectuee
	<hr />
	<%
		String usrn = session.getAttribute("login").toString();
	%>
	Username:<%=usrn%>
	Depart:${statutResa.getAeroportdepart()}
	Arrivee:${statutResa.getAeroportarrivee()}
	Date:${statutResa.getDatedepart()}
	<hr />
	<%@include file="footer.jsp"%>
</body>
</html>