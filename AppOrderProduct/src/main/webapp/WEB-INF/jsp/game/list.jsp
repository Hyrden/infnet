<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<title>Game Registration</title>
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- Table -->
	<div class="container">
	  <h2>Games</h2>
	  <button type="button" class="btn btn-dark" onclick="location.href = '/game';" >New Game</button>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>Id</th>
	        <th>Name</th>
	        <th>Code</th>
	        <th>Description</th>	        
	        <th>Company</th>
	        <th>Genre</th>        
	        <th>Is Preorder?</th>
	        <th>Release Date</th>
	        <th>Value</th>
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="g" items="${games}">
	    	<tr>
		        <td>${g.id}</td>
		        <td>${g.name}</td>
		        <td>${g.code}</td>
		        <td>${g.description}</td>
		        <td>${g.company}</td>
		        <td>${g.category}</td>		        
		        <td>${g.preOrder == true ? "Yes" : "No"}</td>
		        <td>${g.releaseDate}</td>
		        <td>${g.value}</td>
		        <td><a href="/game/${g.id}/delete">delete</a></td>
	      	</tr>
	    </c:forEach>	
	    </tbody>
	  </table>	  
	  <p>Total: ${games.size()}</p>
	</div>
</body>
</html>