<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<title>Order Registration</title>
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- ******** -->
	  <div class="container">
		<h2>Order Registration</h2>
		  <form action="/order/insert" method="post">
		  	<div class="form-group">
		      <label>Order Number:<span class="required" style="color:red" >*</span></label>
		      <input type="number" class="form-control" name="orderNumber" required>
		    </div>
		    <div class="form-group">
		      <label>Payment Method:</label>
		      <input type="text" class="form-control" name="paymentMethod">
		    </div>
		    <button type="submit" class="btn btn-dark">Submit</button>
		  </form>
		</div>
</body>
</html>