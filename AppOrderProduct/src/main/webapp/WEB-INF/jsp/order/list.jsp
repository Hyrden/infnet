<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Order Registration</title>
</head>
<body>
	<!-- Navbar -->
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  <div class="container-fluid">
	    <ul class="navbar-nav">
	      <li class="nav-item">
	        <a class="nav-link active" href="/">Home</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link active" href="/game/list">Games</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link active" href="/software/list">Softwares</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link active" href="/peripheral/list">Peripherals</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link active" href="/product/list">Products</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link active" href="/order/list">Order</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link active" href="/account/list">Account</a>
	      </li>
	    </ul>
	  </div>
	</nav>
	<!-- Table -->
	<div class="container">
	  <h2>Orders</h2>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>Id</th>
	        <th>Order Number</th>
	        <th>Creted Date</th>
	        <th>Payment Method</th>	        
	        <th>Account</th>
	        <th>Products</th>      
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="o" items="${orders}">
	    	<tr>
		        <td>${o.id}</td>
		        <td>${o.orderNumber}</td>
		        <td>${o.createdDate}</td>
		        <td>${o.paymentMethod}</td>
		        <td>${o.account}</td>
		        <td>${o.products}</td>
		        <td><a href="/order/${o.id}/delete">delete</a></td>
	      	</tr>
	    </c:forEach>	
	    </tbody>
	  </table>	  
	  <p>Total: ${orders.size()}</p>
	</div>
</body>
</html>