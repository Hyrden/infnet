<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>User Authentication</title>
</head>
<body>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- ******** -->
	  <div class="container">	  
		<h2>User Authentication</h2>
		  <form action="/login" method="post">
		    <div class="form-group">
		      <label>Email:<span class="required" style="color:red" >*</span></label>
		      <input type="email" class="form-control" placeholder="Enter email" name="email" required>
		    </div>
		    <div class="form-group">
		      <label>Password:<span class="required" style="color:red" >*</span></label>
		      <input type="password" class="form-control" placeholder="Enter password" name="password" required>
		    </div>
		    <button type="submit" class="btn btn-default">Submit</button>
		  </form>
		</div>
</body>
</html>