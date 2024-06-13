<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Home</title>
            <%@include file="styles.jsp" %>
        </head>

        <body>
            <%@include file="nav.jsp" %>

 <!-- Home -->
    <section class="masthead page-section bg-primary" id="about">
        <div class="container px-4 px-lg-5">
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div class="col-lg-8 text-center">
                    <h2 class="text-white mt-0">Home</h2>
                    <hr class="divider divider-light" />
                    <p class="text-white-75 mb-2"> Adicione suas transações aqui!<p>
                </div>
            </div>
        </div>
    </section>

<div class="container mt-5">
    <h1 class="mb-4 text-center">Tabela</h1>
    <table class="table table-striped">
        <thead>
            <tr>
                <th scope="col">Data</th>
                <th scope="col">Descrição</th>
                <th scope="col">Categoria</th>
                <th scope="col">Valor</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>2024-06-10</td>
                <td>Salário</td>
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
                <td>Salário</td>
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
                <td>Salário</td>
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
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                   <button type="button" data-bs-toggle="modal" data-bs-target="#exampleModal" class="btn btn-primary btn-sm">
                   	<i class="fas fa-plus"></i> Adicionar	
                   </button>
               </td>
            </tr>
            <!-- Adicione mais linhas conforme necess�rio -->
        </tbody>
    </table>
	
	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Adicionar transação</h5>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
	        ...
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-outline-danger" data-bs-dismiss="modal">Cancelar</button>
	        <button type="button" class="btn btn-primary">Salvar</button>
	      </div>
	    </div>
	  </div>
	</div>
</div>                   
            
</section>
    
    <%@include file="footer.jsp" %>
	
	<%@include file="scripts.jsp" %>
</body>
</html>