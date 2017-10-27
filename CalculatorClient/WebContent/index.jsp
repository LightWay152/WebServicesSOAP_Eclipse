<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=utf-8>
<title>Calculator</title>
</head>
<body>
	<h1>Sum of 2 numbers</h1>
	<form action="CalculatingServlet" method="get">
		Number A: <input type="text" name="numberA"/>
		<br>
		Number B: <input type="text" name="numberB"/>
		<br>
		<input type="submit" value="Add">
	</form>
	
	<h1>Subtraction of 2 numbers</h1>
	<form action="CalculatingServlet" method="post">
		Number A: <input type="text" name="numberA"/>
		<br>
		Number B: <input type="text" name="numberB"/>
		<br>
		<input type="submit" value="Sub">
	</form>
</body>
</html>