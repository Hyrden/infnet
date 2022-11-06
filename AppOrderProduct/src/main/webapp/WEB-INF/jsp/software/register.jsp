<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Software Registration</title>
</head>
<body>
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