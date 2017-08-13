<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>connexion</title>
</head>
<body>
	<form action="../login.php" method="POST">
		<table>
			<tr>
				<td><label>login</label></td>
				<td><input type="text" name="txtlogin"></td>
			</tr>
			<tr>
				<td><label>password</label></td>
				<td><input type="text" name="txtpassword"></td>
			</tr>
			<tr>
				<td><a href="formulaireClient.jsp">enregistrer</a></td>
				<td><input type="submit" value="login"></td>
			</tr>
			
		</table>
	</form>
	<p>
		<%
			String log=(String)request.getAttribute("txtlogin");
			if(log!=null)
				out.println(log);
		%>
	</p>
</body>
</html>