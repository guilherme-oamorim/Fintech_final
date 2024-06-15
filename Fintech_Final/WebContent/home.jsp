<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <%@include file="styles.jsp" %>
</head>

<body class="bg-primary">
    <%@include file="nav.jsp" %>

 <!-- Home -->
        <div class="container d-flex flex-column justify-content-center min-vh-100 px-4 px-lg-5">
	        <div class="row gx-4 gx-lg-5 justify-content-center">
	            <div class="col-lg-12 text-center">
	                <h1 class="text-white mt-0">Home</h1>
	                <hr class="divider divider-light" />
	                <p class="text-white-75 mb-2">Adicione suas transações e investimentos!</p>
	            </div>
	            <div class="col-lg-12 d-flex justify-content-center mt-4">
	            	<form method="get" action="transacao">
		            	<input type="hidden" value="listar" name="acao">     	
	                	<input type="submit" value="Ir para Transações"class="btn btn-primary mx-2">
	            	</form>
	            	<form>
		                <a href="transacao.jsp" class="btn btn-primary mx-2">Ir para Investimentos</a>
	            	</form>
	            </div>
	        </div>
	    </div>
    
        

    <%@include file="footer.jsp" %>
	
	<%@include file="scripts.jsp" %>
</body>
</html>