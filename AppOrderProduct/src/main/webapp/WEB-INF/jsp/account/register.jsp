<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Account Registration</title>
</head>
<body>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- ******** -->
	  <div class="container">
		<h2>Account Registration</h2>
		  <form action="/account/insert" method="post">
		  	<div class="form-group">
		      <label>Name:<span class="required" style="color:red" >*</span></label>
		      <input type="text" class="form-control" name="name" required>
		    </div>
		    <div class="form-group">
		      <label>Email:<span class="required" style="color:red" >*</span></label>
		      <input type="email" class="form-control" name="email" required>
		    </div>
		    <div class="form-group">
		      <label>Document Number:<span class="required" style="color:red" >*</span></label>
		      <input type="text" class="form-control" name="documentNumber" required>
		    </div>		    
		    <div class="form-group">
		      <label>Birthday:<span class="required" style="color:red" >*</span></label>
		      <input type="date" class="form-control" name="birthday" required>
		    </div>		    
		    <div class="form-group">
		      <label>Street:</label>
		      <input type="text" class="form-control" name="addressStreet">
		    </div>		    
		    <div class="form-group">
		      <label>Number:</label>
		      <input type="number" class="form-control" name="addressNumber">
		    </div>	    
		    <div class="form-group">
		      <label>Complement:</label>
		      <input type="text" class="form-control" name="addressComplement">
		    </div>	    		    	    
		    <div class="form-group">
		      <label>City:</label>
		      <input type="text" class="form-control" name="addressCity">
		    </div>
		    <div class="form-group">
		      <label>State:</label>
		      <input type="text" class="form-control" name="addressState">
		    </div>		    
		    <div class="form-group">
		      <label>Postal Code:</label>
		      <input type="text" class="form-control" name="addressPostalCode">
		    </div>			    	    
		    <div class="form-group">
		      <label>Country:</label>
		      <input type="text" class="form-control" name="addressCountry">
		    </div>	
		    <button type="submit" class="btn btn-default">Submit</button>
		  </form>
		</div>
</body>
</html>