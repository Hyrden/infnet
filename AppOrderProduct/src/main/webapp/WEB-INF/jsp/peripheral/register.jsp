<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Peripheral Registration</title>
</head>
<body>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- ******** -->
	  <div class="container">
		<h2>Peripheral Registration</h2>
		  <form action="/peripheral/insert" method="post">
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
		      <label>Firmware:<span class="required" style="color:red" >*</span></label>
		      <input type="text" class="form-control" name="firmware" required>
		    </div>
		    <div class="form-group">
		      <label>Warrant:<span class="required" style="color:red" >*</span></label>
		      <input type="date" class="form-control" name="warrant" required>
		    </div>
		    <div class="form-group">
		      <label>Weight:<span class="required" style="color:red" >*</span></label>
		      <input type="number" class="form-control" name="weight" required>
		    </div>
		    <button type="submit" class="btn btn-default">Submit</button>
		  </form>
		</div>
</body>
</html>