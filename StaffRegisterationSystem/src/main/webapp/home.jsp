<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>

	<meta charset="ISO-8859-1">
		<title>Staff Registeration</title>
	</head>
	<body>
	
		<form action="/addStaff" method="post">
			<table border="1" width="50%">
			<input type="hidden" name="staff_id" default="0"/>
			<tr>
				<td>Staff Name: </td>
				<td><input type="text" name="staff_name"/></td>

			</tr>
			<tr>
				<td>Date of birth: </td>
				<td><input type="date" name="date_of_birth"/></td>

			</tr>
			<tr>
				<td>address: </td>
				<td><input type="text" name="address"/></td>

			</tr>
			<tr>
				<td>gender: </td>
				<td><input type="hidden" name="countr_id" default="0"/><input type="text" name="gender"/></td>

			</tr>
			<tr>
				<td>salary </td>
				<td><input type="hidden" name="salary" value="0"/></td>

			</tr>
			<tr>
				<td>highest_qualification </td>
				<td><input type="text" name="highest_qualification"/></td>

			</tr>
			<tr>
				<td>Mail Id: </td>
				<td><input type="text" name="email_id"/></td>

			</tr>
			<tr>
				<td>contact_number </td>
				<td><input type="text" name="contact_number"/></td>

			</tr>
			<tr>
				<td>designation </td>
				<td><input type="text" name="designation"/></td>

			</tr>
			<tr>
				<td>YOP: </td>
				<td><input type="date" name="year_passed_out"/></td>

			</tr>
			<tr>
				<td>experience </td>
				<td><input type="text" name="experience"/></td>

			</tr>
			<tr>
				<td>Date of Joining: </td>
				<td><input type="date" name="DOJ"/></td>

			</tr>
			
			<tr>
				<td>Register: </td>
				<td><input type="submit" value="register"/></td>

			</tr>
			




		</table>
		</form>
</body>
</html>