<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-inverse">
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
    <c:if test="${empty user}">
    	<li><a href="/user"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      	<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </c:if>
    <c:if test="${not empty user}">
    	<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span>Logout ${user.name}</a></li>
    </c:if>
      
    </ul>
  </div>
</nav>