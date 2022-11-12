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
	<h1>Saudações, professores e alunos</h1>
	<p style="font-weight: bold;color: red">Status: FEATURE 4 em andamento</p>
	<h4>Segue lista de todas as customizações feitas até o presente momento:</h4>
	<p>
		1 - Nas telas de inserção, podem existir campos obrigatório ou opcionais;<br>
		2 - Na tela de login, é exibida uma mensagem caso o usuário digite as credenciais erradas;<br>
		3 - Na tela de inserção de usuário, há um campo de repetir a senha. 
		O usuário só será inserido caso as senhas estejam iguais;<br>
		4 - O usuário tem um campo boolean a mais, que serve para diferenciar um admin de usuários comuns. 
		O admin consegue enxergar toda a lista de pedidos e de contas, enquanto o usuário comum só pode ver as dele;
	</p>
	<p style="font-weight: bold;">OBS: Address tem ligação com Account em vez de User</p><br>
	<h4>Bugs que identifiquei (e tentarei resolver depois, caso dê tempo):</h4>
	<p>
		1 - [SEGURANÇA] Ao digitar a rota no endereço, um usuário não cadastrado pode fazer DMLs;<br>
		2 - [VISUAL] Na tela de criação de usuário, se os campos Password e Repeat Password divergirem,
		o botão de Sign Up desaparece, e o de Login vira Logout com o nome de usuário que foi tentado criar 
		(porém o backend funciona corretamente, e o usuário não é criado);
	</p>
	<div class="container">
	<div class="b-example-divider"></div>
	  <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
	  <div class="col-md-4 d-flex align-items-center">  
	  		<span class="mb-3 mb-md-0 text-muted">Aluno: João Pedro Galvão e Albuquerque Lima - joaopedro.lima@al.infnet.edu.br
	  		<a target="_blank" href="https://www.linkedin.com/in/jpedro-galvao/">Linkedin</a>
	  		</span>    
		</div>
	  </footer>
	  <div class="b-example-divider"></div>
	</div>
</body>
</html>