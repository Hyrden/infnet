<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Software Registration</title>
</head>
<body>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- Table -->
	<div class="container">
	  <h2>Softwares</h2>
	  <button type="button" class="btn btn-dark" onclick="location.href = '/software';" >New Software</button>
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