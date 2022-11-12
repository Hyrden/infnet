<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<title>User Registration</title>
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- ******** -->
	<div class="container">
	  <h2>Users</h2>
	  <button type="button" class="btn btn-dark" onclick="location.href = '/user';" >New User</button>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>Id</th>
	        <th>Name</th>
	        <th>Email</th>	        
	        <th>Password</th>
	        <th>Is Admin?</th>   
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="u" items="${users}">
	    	<tr>
		        <td>${u.id}</td>
		        <td>${u.name}</td>
		        <td>${u.email}</td>
		        <td>${u.password}</td>
		        <td>${u.isAdmin}</td>
		        <td><a href="/user/${u.id}/delete">delete</a></td>
	      	</tr>
	    </c:forEach>	
	    </tbody>
	  </table>	  
	  <p>Total: ${users.size()}</p>
	</div>
</body>
</html>