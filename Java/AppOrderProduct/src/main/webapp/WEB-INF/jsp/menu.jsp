<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/">AppOrderProduct</a>
    </div>
    <ul class="nav navbar-nav">
    	<c:if test="${not empty user}">
    		<c:if test="${user.isAdmin}">
    			<li class="nav-item">
	        		<a class="nav-link active" href="/user/list">User</a>
	     		</li>
    		</c:if>    			     	
	    <li class="nav-item">
	        <a class="nav-link active" href="/account/list">Account</a>
	    </li>		    
	      <li class="nav-item">
	        <a class="nav-link active" href="/order/list">Order</a>
	      </li>
    	</c:if>	      
	      <li class="nav-item">
	        <a class="nav-link active" href="/game/list">Games</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link active" href="/software/list">Softwares</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link active" href="/peripheral/list">Peripherals</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link active" href="/product/list">Products</a>
	      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">    
   	<div class="text-end">
    <c:if test="${empty user}">
      <button onclick="location.href = '/login';" type="button" class="btn btn-outline-light me-2">Login</button>
      <button onclick="location.href = '/user';" type="button" class="btn btn-warning">Sign-up</button>
    </c:if>
    <c:if test="${not empty user}">
    	<button onclick="location.href = '/logout';" type="button" class="btn btn-outline-light me-2">Logout ${user.name}</button>
    </c:if>
     </div>
    </ul>
  </div>
</nav>