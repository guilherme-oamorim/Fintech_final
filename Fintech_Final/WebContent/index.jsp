<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<%@include file="styles.jsp" %>
</head>
<body>
	<%@include file="nav.jsp"%>

<div class="container">
	<h1>Cadastro</h1>
	<c:if test="${not empty msg }">
		<div class="alert alert-success">${msg}</div>
	</c:if>
	<c:if test="${not empty erro }">
		<div class="alert alert-danger">${erro}</div>
	</c:if>
	<form action="login" method="post">
		<input type="hidden" value="cadastrar" name="acao">
		<div class="form-group">
			<label for="id-nome">Nome</label>
			<input type="text" name="nome" id="id-nome" class="form-control">
		</div>
		<div class="form-group">
			<label for="id-valor">Email</label>
			<input type="text" name="email" id="id-valor" class="form-control">
		</div>
		<div class="form-group">
			<label for="id-quantidade">Senha</label>
			<input type="text" name="senha" id="id-quantidade" class="form-control">
		</div>
		<div class="form-group">
			<label for="id-fabricacao">Saldo</label>
			<input type="text" name="saldo" id="id-fabricacao" class="form-control">
		</div>
		<input type="submit" value="Salvar" class="btn btn-primary">
	</form>
</div>
	
	<%@include file="footer.jsp" %>
</body>
</html>