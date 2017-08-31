<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<%
	String toPrint = "";
	String usrn = request.getParameter("usrn");
	String pswd = request.getParameter("pswd");
	if (usrn != null && pswd != null) {
		toPrint = usrn.toString() + " " + pswd.toString();
	}
	session.setAttribute("login", usrn);
%>
<body>
	<%@include file="header.jsp"%>
	<form method="post" action="">
		username:<input name="usrn" type="text" value="<%=usrn%>" /><br />
		password:<input name="pswd" type="password" value="<%=pswd%>" /><br />
		<input type="submit" value="login" />
	</form>
	<hr />
	resultat =<%=toPrint%>
	<a href = "param_resa.jsp">Resa</a>
	<%@include file="footer.jsp"%>
</body>
</html>