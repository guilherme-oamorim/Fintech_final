<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Transação</title>
            <%@include file="styles.jsp" %>
        </head>

        <body>
            <%@include file="nav.jsp" %>

 <!-- Home -->
    <section class="masthead page-section bg-primary" id="about" style="padding-bottom: 1rem">
        <div class="container px-4 px-lg-5">
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div class="col-lg-8 text-center">
                    <h2 class="text-white mt-0">Transação</h2>
                    <hr class="divider divider-light" />
                    <p class="text-white-75 mb-2"> Adicione suas transações aqui!<p>
                </div>
            </div>
        </div>
    </section>
	<a href="home.jsp" class="btn btn-primary" style="border-radius: 0px" id="home">Home</a>
	
<div class="container mt-5">
	<c:if test="${not empty msg }">
		<div class="alert alert-success">${msg}</div>
	</c:if>
	<c:if test="${not empty erro }">
		<div class="alert alert-danger">${erro}</div>
	</c:if>
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
            <c:forEach items="${transacao}" var="t">
				<tr>
					<td>${t.dt_transacao}</td>
					<td>${t.ds_transacao}</td>
					<td>${t.nm_categoria}</td>
					<td>R$ ${t.vl_transacao}</td>
					<td>
	                  	<div class="d-flex justify-content-between">
		                    <button OnClick="Editar('${t.id_transacao}', '${t.dt_transacao}', '${t.ds_transacao}', '${t.id_categoria}', '${t.vl_transacao}')" type="button" data-bs-toggle="modal" data-bs-target="#ModalEditar" class="btn btn-secondary btn-sm flex-fill me-3 ms-3">
		                        <i class="fas fa-edit"></i> Editar
		                    </button>
		                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalExcluir" class="btn btn-danger btn-sm flex-fill me-3 ms-3">
		                        <i class="fas fa-trash-alt"></i> Excluir
		                    </button>
	               		</div>
	              	</td>
				</tr>
			</c:forEach>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                   <div class="d-flex justify-content-start">
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalAdicionar" class="btn btn-primary btn-sm me-3 ms-3 flex-fill">
	                        <i class="fas fa-plus"></i> Adicionar
	                    </button>
                	</div>
               </td>
            </tr>
            <!-- Adicione mais linhas conforme necess�rio -->
        </tbody>
    </table>
    
    <!-- Modal Excluir-->
	<div class="modal fade " id="ModalExcluir" tabindex="-1" aria-labelledby="ModalExcluir" aria-hidden="true">
	  <div class="modal-dialog modal-sm">
	    <div class="modal-content">
	      	<div class="modal-header">
		        <h5 class="modal-title" id="ModalExcluir">Excluir transação?</h5>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      	</div>
	      	<div class="modal-body">
	      		<div class="container mt-2">
			        <table class="table">
			            <tr>
			                <th>Data</th>
			                <td>2024/02/20</td>
			            </tr>
			            <tr>
			                <th>Descrição</th>
			                <td>Aluguel</td>
			            </tr>
			            <tr>
			                <th>Categoria</th>
			                <td>Casa</td>
			            </tr>
			            <tr>
			                <th>Valor</th>
			                <td>R$ 1333,00</td>
			            </tr>
			        </table>
			    </div>
	      	</div>
		    <div class="modal-footer">
			      <button type="button" class="btn btn-outline-danger" data-bs-dismiss="modal">Cancelar</button>
			      <button type="submit" class="btn btn-danger">Excluir</button>
		    </div>
	    </div>
	  </div>
	</div>
	
	<!-- Modal Editar-->
	<div class="modal fade" id="ModalEditar" tabindex="-1" aria-labelledby="ModalEditar" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
		        <h5 class="modal-title" id="ModalEditar">Editar transação</h5>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <form method="post" action="transacao">
	      	<input type="hidden" value="editar" name="acao">
	      	<input type="hidden" name="TransacaoEditar" id="idTransacao">
			    <div class="modal-body my-5 mx-5">
			       		<div class="form-group row mb-4">
                             <div class="col-sm-6 mb-3 mb-sm-0">
                             	<label>Data da transação</label>
                                <input type="date" name="Data" class="form-control form-control-user" id="DataEditar"
                                      required>
                             </div>
                             <div class="col-sm-6">
                             	<label>Valor</label>
                             	<div class="input-group">
				                    <div class="input-group-prepend">
				                        <span class="input-group-text">R$</span>
				                    </div>
				                    <input type="number" name="Valor" class="form-control" id="ValorEditar"
				                           step="0.01" min="0" required>
				                </div>
                             </div>
                        </div>
                        <div class="form-group mb-4">
                        	<label>Descrição</label>
                            <textarea name="Descricao" class="form-control form-control-user"
                                id="DescricaoEditar" style="resize: vertical" required></textarea>
                     	</div>
                     	<div class="form-group">
                     		<label>Categoria</label>
                            <select name="Categoria" class="form-select" id="CategoriaEditar" required>
                                <option value="selecionar" disabled>Selecione uma categoria</option>
			                    <option value="1">Casa</option>
			                    <option value="2">Alimentação</option>
			                    <option value="3">Educação</option>
			                    <option value="4">Transporte</option>
			                    <option value="5">Filhos</option>
			                    <option value="6">Saúde</option>
			                    <option value="7">Lazer</option>
                            </select>
                     	</div>
			    </div>
			    <div class="modal-footer">
				      <button type="button" class="btn btn-outline-danger" data-bs-dismiss="modal">Cancelar</button>
				      <button type="submit" class="btn btn-primary"><i class="fas fa-edit"></i>Salvar</button>
			    </div>
	      </form>
	    </div>
	  </div>
	</div>
	
	<!-- Modal Adicionar-->
	<div class="modal fade" id="ModalAdicionar" tabindex="-1" aria-labelledby="ModalAdicionar" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
		        <h5 class="modal-title" id="ModalAdicionar">Adicionar transação</h5>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <form class="user" action="transacao" method="post"> 
	      	<input type="hidden" value="cadastrar" name="acao">
			    <div class="modal-body my-5 mx-5">
			       		<div class="form-group row mb-4">
                             <div class="col-sm-6 mb-3 mb-sm-0">
                             	<label>Data da transação</label>
                                <input type="date" name="Data" class="form-control form-control-user" id="DataAdicionar"
                                     required>
                             </div>
                             <div class="col-sm-6">
                             	<label>Valor</label>
                             	<div class="input-group">
				                    <div class="input-group-prepend">
				                        <span class="input-group-text">R$</span>
				                    </div>
				                    <input type="number" name="Valor" class="form-control" id="ValorAdicionar"
				                           step="0.01" min="0" required>
				                </div>
                             </div>
                        </div>
                        <div class="form-group mb-4">
                        	<label>Descrição</label>
                            <textarea name="Descricao" class="form-control form-control-user"
                                id="DescricaoAdicionar" style="resize: vertical" required></textarea>
                     	</div>
                     	<div class="form-group">
                     		<label>Categoria</label>
                            <select name="Categoria" class="form-select" id="CategoriaAdicionar" required>
                                <option value="selecionar" selected disabled>Selecione uma categoria</option>
			                    <option value="1">Casa</option>
			                    <option value="2">Alimentação</option>
			                    <option value="3">Educação</option>
			                    <option value="4">Transporte</option>
			                    <option value="5">Filhos</option>
			                    <option value="6">Saúde</option>
			                    <option value="7">Lazer</option>
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
	
	<script>
		function Editar(id_transacao, dt_transacao, ds_transacao, id_categoria, vl_transacao){
			console.log(id_transacao, dt_transacao, ds_transacao, id_categoria, vl_transacao);
			
			var idTransacao = document.getElementById("idTransacao");
			idTransacao.value = id_transacao;
		
			var DataEditar = document.getElementById("DataEditar");
			DataEditar.value = dt_transacao;
			
			var ValorEditar = document.getElementById("ValorEditar");
			ValorEditar.value = vl_transacao;
			
			var DescricaoEditar = document.getElementById("DescricaoEditar");
			DescricaoEditar.value = ds_transacao;
			
			var CategoriaEditar = document.getElementById("CategoriaEditar");
			CategoriaEditar.value = id_categoria;
			
		}
		
        document.addEventListener("DOMContentLoaded", function() {
            var selectedValue = "categoria4"; // Altere este valor conforme necessário
            var selectElement = document.getElementById("CategoriaEditar");
            selectElement.value = selectedValue;
        });
    </script>
</body>
</html>