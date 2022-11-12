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
	<script type="text/javascript">
		window.addEventListener('load', event => {
			var concat = '';
			for(var i = 0; i<5;i++){
				concat+=Math.floor(Math.random() * 5) + 1;
			}
			document.getElementById("orderNumber").value = concat;
		})
	</script>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<!-- ******** -->
	  <div class="container">
		<h2>Order Registration</h2>
		  <form action="/order/insert" method="post">
		  	<div class="form-group">
	      <label>Order Number:</label>
	      <input id="orderNumber" type="number" class="form-control" name="orderNumber" value="" readonly>
	    </div>
	    	    
	    <label for="paymentMethod">Payment Method:</label>
		<select name="paymentMethod" id="cars">
		  <option value="PagSeguro">Pagseguro</option>
		  <option value="PayPal">PayPal</option>
		  <option value="EBANX">EBANX</option>
		</select>
		
	    <div class="form-group">
	      <label>Account:</label>
	      <select name="account" class="form-control">
	      	<c:forEach var="a" items="${accounts}">
	      		<option value="${a.id}">${a.name}</option>
	      	</c:forEach>
	      </select>
	    </div>

	    <div class="form-group">
	      <label>Products:</label>
	      	<c:forEach var="p" items="${products}">
				<div class="form-check">
				  <input class="form-check-input" type="checkbox" name="products" value="${p.id}">
				  <label class="form-check-label"> ${p.name}</label>
				</div>	   
			</c:forEach>   
	    </div>
		    <button type="submit" class="btn btn-dark">Submit</button>
		  </form>
		</div>
</body>
</html>