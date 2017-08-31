<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>parametre_resa</title>
</head>
<body>

	<form method="post" action="./ServletResa">
		Aeroport de depart: <input name="aeroportdepart" /> <br /> Aeroport
		arrive: <input name="aeroportarrivee" /> <br /> Date <input type="date"
			name="datedepart" /><br /> <input type="submit" value="reserver" />

	</form>
</body>
</html>
