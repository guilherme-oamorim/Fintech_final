<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Home</title>
            <%@include file="styles.jsp" %>
        </head>

        <body>
            <%@include file="nav.jsp" %>

 <!-- Home -->
    
    <!-- Sobre n�s-->
    <section class="masthead page-section bg-primary" id="about">
        <div class="container px-4 px-lg-5">
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div class="col-lg-8 text-center">
                    <h2 class="text-white mt-0">Home</h2>
                    <hr class="divider divider-light" />
                    <p class="text-white-75 mb-4"></div>
            </div>
        </div>
    </section>

<div class="container mt-5">
    <h1 class="mb-4 text-center">Tabela</h1>
    <table class="table table-striped">
        <thead>
            <tr>
                <th scope="col">Data</th>
                <th scope="col">Descri��o</th>
                <th scope="col">Categoria</th>
                <th scope="col">Valor</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>2024-06-10</td>
                <td>Sal�rio</td>
                <td>Renda</td>
                <td>R$ 5000,00</td>
                  <td>
                   <button class="btn btn-secondary btn-sm">
                   	<i class="fas fa-edit"></i> Editar
                   </button>
                   <button class="btn btn-danger btn-sm">
                   	<i class="fas fa-trash-alt"></i> Excluir
                   </button>
               </td>
            </tr>
            <tr>
                <td>2024-06-11</td>
                <td>Aluguel</td>
                <td>Despesas</td>
                <td>R$ 1500,00</td>
                  <td>
                   <button class="btn btn-secondary btn-sm">
                   	<i class="fas fa-edit"></i> Editar
                   </button>
                   <button class="btn btn-danger btn-sm">
                   	<i class="fas fa-trash-alt"></i> Excluir
                   </button>
               </td>
            </tr>
            <tr>
                <td>2024-06-12</td>
                <td>Compra de supermercado</td>
                <td>Despesas</td>
                <td>R$ 300,00</td>
                <td>
                   <button class="btn btn-secondary btn-sm">
                   	<i class="fas fa-edit"></i> Editar
                   </button>
                   <button class="btn btn-danger btn-sm">
                   	<i class="fas fa-trash-alt"></i> Excluir
                   </button>
               </td>
            </tr>
            <tr>
                <td>2024-06-10</td>
                <td>Sal�rio</td>
                <td>Renda</td>
                <td>R$ 5000,00</td>
                  <td>
                   <button class="btn btn-secondary btn-sm">
                   	<i class="fas fa-edit"></i> Editar
                   </button>
                   <button class="btn btn-danger btn-sm">
                   	<i class="fas fa-trash-alt"></i> Excluir
                   </button>
               </td>
            </tr>
            <tr>
                <td>2024-06-11</td>
                <td>Aluguel</td>
                <td>Despesas</td>
                <td>R$ 1500,00</td>
                  <td>
                   <button class="btn btn-secondary btn-sm">
                   	<i class="fas fa-edit"></i> Editar
                   </button>
                   <button class="btn btn-danger btn-sm">
                   	<i class="fas fa-trash-alt"></i> Excluir
                   </button>
               </td>
            </tr>
            <tr>
                <td>2024-06-12</td>
                <td>Compra de supermercado</td>
                <td>Despesas</td>
                <td>R$ 300,00</td>
                <td>
                   <button class="btn btn-secondary btn-sm">
                   	<i class="fas fa-edit"></i> Editar
                   </button>
                   <button class="btn btn-danger btn-sm">
                   	<i class="fas fa-trash-alt"></i> Excluir
                   </button>
               </td>
            </tr>
            <tr>
                <td>2024-06-10</td>
                <td>Sal�rio</td>
                <td>Renda</td>
                <td>R$ 5000,00</td>
                  <td>
                   <button class="btn btn-secondary btn-sm">
                   	<i class="fas fa-edit"></i> Editar
                   </button>
                   <button class="btn btn-danger btn-sm">
                   	<i class="fas fa-trash-alt"></i> Excluir
                   </button>
               </td>
            </tr>
            <tr>
                <td>2024-06-11</td>
                <td>Aluguel</td>
                <td>Despesas</td>
                <td>R$ 1500,00</td>
                  <td>
                   <button class="btn btn-secondary btn-sm">
                   	<i class="fas fa-edit"></i> Editar
                   </button>
                   <button class="btn btn-danger btn-sm">
                   	<i class="fas fa-trash-alt"></i> Excluir
                   </button>
               </td>
            </tr>
            <tr>
                <td>2024-06-12</td>
                <td>Compra de supermercado</td>
                <td>Despesas</td>
                <td>R$ 300,00</td>
                <td>
                   <button class="btn btn-secondary btn-sm">
                   	<i class="fas fa-edit"></i> Editar
                   </button>
                   <button class="btn btn-danger btn-sm">
                   	<i class="fas fa-trash-alt"></i> Excluir
                   </button>
               </td>
            </tr>
            <!-- Adicione mais linhas conforme necess�rio -->
        </tbody>
    </table>
</div>                   
            
</section>
    
    <%@include file="footer.jsp" %>
	
	<%@include file="scripts.jsp" %>
</body>
</html>