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
	<!-- Table -->
	<div class="container">
	  <h2>Orders</h2>
	  <button type="button" class="btn btn-dark" onclick="location.href = '/order';" >New Order</button>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>Id</th>
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
		        <td>${o.id}</td>
		        <td>${o.orderNumber}</td>
		        <td>${o.createdDate}</td>
		        <td>${o.paymentMethod}</td>
		        <td>${o.account.name}</td>
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