<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<title>AppOrderProduct</title>
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	<!-- Navbar -->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<h1>Sauda��es, professores e alunos</h1>
	<p style="font-weight: bold;color: red">Status: FEATURE 4 em andamento</p>
	<h4>Segue lista de todas as customiza��es feitas at� o presente momento:</h4>
	<p>
		1 - Nas telas de inser��o, podem existir campos obrigat�rio ou opcionais;<br>
		2 - Na tela de login, � exibida uma mensagem caso o usu�rio digite as credenciais erradas;<br>
		3 - Na tela de inser��o de usu�rio, h� um campo de repetir a senha. 
		O usu�rio s� ser� inserido caso as senhas estejam iguais;<br>
		4 - O usu�rio tem um campo boolean a mais, que serve para diferenciar um admin de usu�rios comuns. 
		O admin consegue enxergar toda a lista de pedidos e de contas, enquanto o usu�rio comum s� pode ver as dele;
	</p>
	<p style="font-weight: bold;">OBS: Address tem liga��o com Account em vez de User</p><br>
	<h4>Bugs que identifiquei (e tentarei resolver depois, caso d� tempo):</h4>
	<p>
		1 - [SEGURAN�A] Ao digitar a rota no endere�o, um usu�rio n�o cadastrado pode fazer DMLs;<br>
		2 - [VISUAL] Na tela de cria��o de usu�rio, se os campos Password e Repeat Password divergirem,
		o bot�o de Sign Up desaparece, e o de Login vira Logout com o nome de usu�rio que foi tentado criar 
		(por�m o backend funciona corretamente, e o usu�rio n�o � criado);
	</p>
	<div class="container">
	<div class="b-example-divider"></div>
	  <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
	  <div class="col-md-4 d-flex align-items-center">  
	  		<span class="mb-3 mb-md-0 text-muted">Aluno: Jo�o Pedro Galv�o e Albuquerque Lima - joaopedro.lima@al.infnet.edu.br
	  		<a target="_blank" href="https://www.linkedin.com/in/jpedro-galvao/">Linkedin</a>
	  		</span>    
		</div>
	  </footer>
	  <div class="b-example-divider"></div>
	</div>
</body>
</html>