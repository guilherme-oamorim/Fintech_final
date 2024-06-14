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
    <h1 class="mb-4 text-center">Transação</h1>
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
	      <form> 
			    <div class="modal-body my-5 mx-5">
			       		<div class="form-group row mb-4">
                             <div class="col-sm-6 mb-3 mb-sm-0">
                             	<label>Data da transação</label>
                                <input type="date" name="Data" class="form-control form-control-user" id="Data"
                                     required>
                             </div>
                             <div class="col-sm-6">
                             	<label>Valor</label>
                             	<div class="input-group">
				                    <div class="input-group-prepend">
				                        <span class="input-group-text">R$</span>
				                    </div>
				                    <input type="number" name="Valor" class="form-control" id="Valor"
				                           step="0.01" min="0" required>
				                </div>
                             </div>
                        </div>
                        <div class="form-group mb-4">
                        	<label>Descrição</label>
                            <textarea name="Descricao" class="form-control form-control-user"
                                id="Descricao" style="resize: vertical" required></textarea>
                     	</div>
                     	<div class="form-group">
                     		<label>Categoria</label>
                            <select name="Categoria" class="form-select" id="Categoria" required>
                                <option value="selecionar" selected disabled>Selecione uma categoria</option>
			                    <option value="categoria1">Categoria 1</option>
			                    <option value="categoria2">Categoria 2</option>
			                    <option value="categoria3">Categoria 3</option>
                            </select>
                     	</div>
			    </div>
			    <div class="modal-footer">
				      <button type="button" class="btn btn-outline-danger" data-bs-dismiss="modal">Cancelar</button>
				      <button type="submit" class="btn btn-primary">Salvar</button>
			    </div>
	      </form>
	    </div>
	  </div>
	</div>
</div>                   
            
</section>
    
    <%@include file="footer.jsp" %>
	
	<%@include file="scripts.jsp" %>
</body>
</html>