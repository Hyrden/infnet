<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Account Registration</title>
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
	  <h2>Accounts</h2>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>Id</th>
	        <th>Name</th>
	        <th>DocumentNumber</th>
	        <th>Email</th>	        
	        <th>Birthday</th>
	        <th>Address</th>   
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="a" items="${accounts}">
	    	<tr>
		        <td>${a.id}</td>
		        <td>${a.name}</td>
		        <td>${a.documentNumber}</td>
		        <td>${a.email}</td>
		        <td>${a.birthday}</td>
		        <td>
		        	<!-- Não formatar a aba da tag pre -->
			        <pre>${a.addressStreet}, ${a.addressNumber} - ${a.addressComplement}.
${a.addressCity} - ${a.addressState} - ${a.addressCountry}. Postal Code: ${a.addressPostalCode}</pre>		        	
		        </td>	
		        <td><a href="/account/${a.id}/delete">delete</a></td>
	      	</tr>
	    </c:forEach>	
	    </tbody>
	  </table>	  
	  <p>Total: ${accounts.size()}</p>
	</div>
</body>
</html>