<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Software Registration</title>
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
	  <h2>Softwares</h2>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>Id</th>
	        <th>Name</th>
	        <th>Code</th>
	        <th>Description</th>	        
	        <th>Company</th>
	        <th>Category</th>        
	        <th>License</th>
	        <th>Max. PC Allowed</th>
	        <th>Current Installations</th>
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="s" items="${softwares}">
	    	<tr>
		        <td>${s.id}</td>
		        <td>${s.name}</td>
		        <td>${s.code}</td>
		        <td>${s.description}</td>
		        <td>${s.company}</td>
		        <td>${s.category}</td>		        
		        <td>${s.license}</td>
		        <td>${s.maxPCAllowed}</td>
		        <td>${s.currentInstallations}</td>
		        <td><a href="/software/${s.id}/delete">delete</a></td>
	      	</tr>
	    </c:forEach>	
	    </tbody>
	  </table>	  
	  <p>Total: ${softwares.size()}</p>
	</div>
</body>
</html>