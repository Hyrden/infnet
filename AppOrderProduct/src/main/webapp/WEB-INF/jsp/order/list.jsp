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
	<!-- Table -->
	<div class="container">
	  <h2>Orders</h2>
	  <p style="font-weight: bold;color: red">${message}</p>
	  <button type="button" class="btn btn-dark" onclick="location.href = '/order';" >New Order</button>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Order Number</th>
	        <th>Created Date</th>
	        <th>Payment Method</th>	        
	        <th>Account</th>
	        <th>Products</th>
	        <th></th>     
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="o" items="${orders}">
	    	<tr>
		        <td>${o.orderNumber}</td>
		        <td>${o.createdDate}</td>
		        <td>${o.paymentMethod}</td>
		        <td>${o.account.name}</td>
		        <td>
		        <c:forEach var="p" items="${o.products}">
		        	Name: ${p.name} Value: ${p.value};
		        </c:forEach>
		        <td><a href="/order/${o.id}/delete">delete</a></td>
	      	</tr>
	    </c:forEach>	
	    </tbody>
	  </table>	  
	  <p>Total: ${orders.size()}</p>
	</div>
</body>
</html>