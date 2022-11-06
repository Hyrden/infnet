<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Order Registration</title>
</head>
<body>
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
		    <button type="submit" class="btn btn-default">Submit</button>
		  </form>
		</div>
</body>
</html>