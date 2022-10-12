<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>

<body>
 <form action="Registration" method="post">
	<h1>Registraion page</h1>
		<table>
			<tr>
				<td>Firstname:</td>
				<td><input type="text" name="firstname"></td>
			</tr>
			<tr>
				<td>Lastname:</td>
				<td><input type="text" name="lastname"></td>
			</tr>
			
			<tr>
				<td>Phone</td>

				<td><input type="tel" name="phno"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
			<td>Language</td>
			<td>C  <input type="checkbox" name="language"value="c">C++<input type="checkbox"name="language"value="C++">Java<input type="checkbox"name="language"value="Java"></td></tr>
			<tr>
				<td><input type="submit" value="submit" value="register"></td>
				</tr>
		</table>


	</form>
 
</body>
</html>