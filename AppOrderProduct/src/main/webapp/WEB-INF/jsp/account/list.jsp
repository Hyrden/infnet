<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Account Registration</title>
</head>
<body>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- ******** -->
	<div class="container">
	  <h2>Accounts</h2>
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
		        <td>
		        	<!-- Não formatar a aba da tag pre -->
			        <pre>${a.addressStreet}, ${a.addressNumber} - ${a.addressComplement}.
${a.addressCity} - ${a.addressState} - ${a.addressCountry}. Postal Code: ${a.addressPostalCode}</pre>		        	
		        </td>
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