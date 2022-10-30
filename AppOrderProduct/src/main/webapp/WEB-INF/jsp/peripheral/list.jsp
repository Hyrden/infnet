<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Peripheral Registration</title>
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
	  <h2>Peripherals</h2>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>Id</th>
	        <th>Name</th>
	        <th>Code</th>
	        <th>Description</th>	        
	        <th>Company</th>
	        <th>Category</th>        
	        <th>Firmware</th>
	        <th>Warrant</th>
	        <th>Weight</th>
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="p" items="${peripherals}">
	    	<tr>
		        <td>${p.id}</td>
		        <td>${p.name}</td>
		        <td>${p.code}</td>
		        <td>${p.description}</td>
		        <td>${p.company}</td>
		        <td>${p.category}</td>		        
		        <td>${p.firmware}</td>
		        <td>${p.warrant}</td>
		        <td>${p.weight}</td>
		        <td><a href="/peripheral/${p.id}/delete">delete</a></td>
	      	</tr>
	    </c:forEach>	
	    </tbody>
	  </table>	  
	  <p>Total: ${games.size()}</p>
	</div>
</body>
</html>