<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Product Registration</title>
</head>
<body>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- Table -->
	<div class="container">
	  <h2>Products</h2>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>Id</th>
	        <th>Name</th>
	        <th>Code</th>
	        <th>Description</th>	        
	        <th>Company</th>
	        <th>Category</th>
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="p" items="${products}">
	    	<tr>
		        <td>${p.id}</td>
		        <td>${p.name}</td>
		        <td>${p.code}</td>
		        <td>${p.description}</td>
		        <td>${p.company}</td>
		        <td>${p.category}</td>
		        <td><a href="/product/${p.id}/delete">delete</a></td>
	      	</tr>
	    </c:forEach>	
	    </tbody>
	  </table>	  
	  <p>Total: ${products.size()}</p>
	</div>
</body>
</html>