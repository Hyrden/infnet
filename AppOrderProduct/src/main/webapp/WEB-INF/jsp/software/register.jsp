<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<title>Software Registration</title>
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- ******** -->
	  <div class="container">
		<h2>Software Registration</h2>
		  <form action="/software/insert" method="post">
		  	<div class="form-group">
		      <label>Name:<span class="required" style="color:red" >*</span></label>
		      <input type="text" class="form-control" name="name" required>
		    </div>
		    <div class="form-group">
		      <label>Code:<span class="required" style="color:red" >*</span></label>
		      <input type="text" class="form-control" name="code" required>
		    </div>
		    <div class="form-group">
		      <label>Description:</label>
		      <input type="text" class="form-control" name="description">
		    </div>		    
		    <div class="form-group">
		      <label>Value:<span class="required" style="color:red" >*</span></label>
		      <input type="number" class="form-control" name="value" required>
		    </div>
		    <div class="form-group">
		      <label>Category:<span class="required" style="color:red" >*</span></label>
		      <input type="text" class="form-control" name="category" required>
		    </div>
		    <div class="form-group">
		      <label>Company:<span class="required" style="color:red" >*</span></label>
		      <input type="text" class="form-control" name="company" required>
		    </div>
		    <div class="form-group">
		      <label>License:<span class="required" style="color:red" >*</span></label>
		      <input type="text" class="form-control" name="license" required>
		    </div>
		    <div class="form-group">
		      <label>Max PC Allowed:<span class="required" style="color:red" >*</span></label>
		      <input type="number" class="form-control" name="warrant" required>
		    </div>
		    <div class="form-group">
		      <label>Current Installation:<span class="required" style="color:red" >*</span></label>
		      <input type="number" class="form-control" name="weight" value=0 readonly="readonly">
		    </div>
		    <button type="submit" class="btn btn-default">Submit</button>
		  </form>
		</div>
</body>
</html>