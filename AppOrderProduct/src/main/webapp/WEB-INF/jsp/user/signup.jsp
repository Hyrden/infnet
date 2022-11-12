<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>User Registration</title>
</head>
<body>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- ******** -->
	  <div class="container">
		<h2>User Registration</h2>
		  <form action="/user/insert" method="post">
		  	<div class="form-group">
		      <label>Name:<span class="required" style="color:red" >*</span></label>
		      <input type="text" class="form-control" placeholder="Enter name" name="name" required>
		    </div>
		    <div class="form-group">
		      <label>Email:<span class="required" style="color:red" >*</span></label>
		      <input type="email" class="form-control" placeholder="Enter email" name="email" required>
		    </div>
		    <div class="form-group">
		      <label>Password:<span class="required" style="color:red" >*</span></label>
		      <input type="password" class="form-control" placeholder="Enter password" name="password" required>
		    </div>
		    <div class="form-group">
		      <label>Repeat Password:<span class="required" style="color:red" >*</span></label>
		      <input type="password" class="form-control" placeholder="Confirm password" name="confirmPassword" required>
		    </div>		    
			<p style="font-weight: bold;color: red">${message}</p>
		    <button type="submit" class="btn btn-default">Submit</button>
		  </form>
		</div>
</body>
</html>