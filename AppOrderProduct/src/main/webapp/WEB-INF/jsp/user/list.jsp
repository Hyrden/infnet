<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>User Registration</title>
</head>
<body>
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