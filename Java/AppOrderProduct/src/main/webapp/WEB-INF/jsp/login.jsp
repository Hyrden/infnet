<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<title>User Authentication</title>
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
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
		    <p style="font-weight: bold;color: red">${message}</p>
		    <button type="submit"  class="btn btn-dark">Submit</button>
		  </form>
		</div>
</body>
</html>