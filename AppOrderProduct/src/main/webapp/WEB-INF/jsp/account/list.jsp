<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<title>Account Registration</title>
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- ******** -->
	<div class="container">
	  <h2>Accounts</h2>
	  <p style="font-weight: bold;color: red">${message}</p>
	  <button type="button" class="btn btn-dark" onclick="location.href = '/account';" >New Account</button>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>Id</th>
	        <th>Name</th>
	        <th>DocumentNumber</th>
	        <th>Email</th>	        
	        <th>Birthday</th>
	        <th>Address</th>   	        
	        <th>User</th>	          	        
	        <th></th>
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
		        <td>${a.address}</td>
		        <th>${a.user.name}</th>	
		        <td><a href="/account/${a.id}/delete">delete</a></td>
	      	</tr>
	    </c:forEach>	
	    </tbody>
	  </table>	  
	  <p>Total: ${accounts.size()}</p>
	</div>
</body>
</html>