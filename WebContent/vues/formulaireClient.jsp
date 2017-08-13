<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>formulaire création d'un client</title>
<script type="text/javascript" src="../js/common.js"></script>
<script type="text/javascript" src="../js/script.js"></script>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<td><label>Nom(*) : </label></td>
				<td><input type="text" name="txtnom" id="txtnom"/></td>
			</tr>
			
			<tr>
				<td><label>Prenom(*) : </label></td>
				<td><input type="text" name="txtprenom" id="txtprenom"/></td>
			</tr>
			<tr>
				<td><label>Adresse : </label></td>
				<td><input type="text" name="txtadress" id="txtadress"/></td>
			</tr>
			
			<tr>
				<td><label>tel(*) : </label></td>
				<td><input type="text" name="txttel" id="txttel"/></td>
			</tr>
			<tr>
				<td><label>login(*) : </label></td>
				<td><input type="text" name="txtlogin" id="txtlogin"/></td>
			</tr>
			<tr>
				<td><label>Password(*) : </label></td>
				<td><input type="password" name="txtpass" id="txtpass"/></td>
			</tr>
			<tr>
				<td><input type="button" id="btnvalider" value="enregistrer"/></tr>
		</table>
	</form>
</body>
</html>