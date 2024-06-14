<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Investimento</title>
            <%@include file="styles.jsp" %>
        </head>

        <body>
            <%@include file="nav.jsp" %>

 <!-- Home -->
    <section class="masthead page-section bg-primary" id="about" style="padding-bottom: 1rem">
        <div class="container px-5 px-lg-5">
            <div class="row gx-5 gx-lg-5 justify-content-center">
                <div class="col-lg-8 text-center">
                    <h2 class="text-white mt-0">Investimento</h2>
                    <hr class="divider divider-light" />
                    <p class="text-white-75 mb-2"> Adicione seus investimentos!<p>
                </div>
            </div>
        </div>
    </section>

    <a href="home.jsp" class="btn btn-primary" style="border-radius: 0px">Home</a>

<div class="container mt-5">
    <table class="table table-striped">
        <thead>
            <tr>
            	<th scope="col">Nome</th>
            	<th scope="col">Descrição</th>
            	<th scope="col">Valor</th>
                <th scope="col">Data</th>
                <th scope="col">Conclusão</th>
                
            </tr>
        </thead>
        <tbody>
            <tr>
            	<td>Criptomoeda</td>
            	<td>Bitcoin</td>
            	<td>R$ 5.000</td>
                <td>2024-06-10</td>
                <td>Indefinido</td>
              
                  <td>
                  	<div class="d-flex justify-content-between">
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalEditar" class="btn btn-secondary btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-edit"></i> Editar
	                    </button>
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalExcluir" class="btn btn-danger btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-trash-alt"></i> Excluir
	                    </button>
                	</div>
               </td>
            </tr>
            <tr>
                <td>Ações</td>
            	<td>Investimento</td>
            	<td>R$ 10.000</td>
                <td>01/01/2024</td>
                <td>03/04/2025</td>
                  <td>
                   <div class="d-flex justify-content-between">
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalEditar" class="btn btn-secondary btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-edit"></i> Editar
	                    </button>
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalExcluir" class="btn btn-danger btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-trash-alt"></i> Excluir
	                    </button>
                	</div>
               </td>
            </tr>
            <tr>
                <td>Tesouro Direto</td>
            	<td>Títulos públicos</td>
            	<td>R$ 350.00</td>
                <td>16/03/2024</td>
                <td>15/10/2026</td>
                <td>
                   <div class="d-flex justify-content-between">
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalEditar" class="btn btn-secondary btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-edit"></i> Editar
	                    </button>
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalExcluir" class="btn btn-danger btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-trash-alt"></i> Excluir
	                    </button>
                	</div>
               </td>
            </tr>
            <tr>
                <td>Títulos de renda</td>
            	<td>CDB</td>
            	<td>R$ 2.000</td>
                <td>01/03/2024</td>
                <td>10/06/2027</td>
                  <td>
                   <div class="d-flex justify-content-between">
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalEditar" class="btn btn-secondary btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-edit"></i> Editar
	                    </button>
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalExcluir" class="btn btn-danger btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-trash-alt"></i> Excluir
	                    </button>
                	</div>
               </td>
            </tr>
            <tr>
                <td>Fundos Imobiliários</td>
            	<td>Investimentos em imóveis</td>
            	<td>R$ 3.000</td>
                <td>01/04/2024</td>
                <td>01/06/2029</td>
                  <td>
                   <div class="d-flex justify-content-between">
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalEditar" class="btn btn-secondary btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-edit"></i> Editar
	                    </button>
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalExcluir" class="btn btn-danger btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-trash-alt"></i> Excluir
	                    </button>
                	</div>
               </td>
            </tr>
            <tr>
                <td>Investimento</td>
            	<td>Poupança</td>
            	<td>R$ 100.00</td>
                <td>13/05/2024</td>
                <td>22/08/2025</td>
                
                <td>
                   <div class="d-flex justify-content-between">
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalEditar" class="btn btn-secondary btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-edit"></i> Editar
	                    </button>
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalExcluir" class="btn btn-danger btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-trash-alt"></i> Excluir
	                    </button>
                	</div>
               </td>
            </tr>
            <tr>
                <td>Títulos de dívida</td>
            	<td>LCI</td>
            	<td>R$ 5.000</td>
                <td>10/10/2028</td>
                <td>11/07/2030</td>
                
                  <td>
                   <div class="d-flex justify-content-between">
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalEditar" class="btn btn-secondary btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-edit"></i> Editar
	                    </button>
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalExcluir" class="btn btn-danger btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-trash-alt"></i> Excluir
	                    </button>
                	</div>
               </td>
            </tr>
            <tr>
               	<td>Títulos de dívida</td>
            	<td>Debêntures</td>
            	<td>R$ 1.500</td>
                <td>27/03/2024</td>
                <td>01/07/2028</td>
                  <td>
                   <div class="d-flex justify-content-between">
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalEditar" class="btn btn-secondary btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-edit"></i> Editar
	                    </button>
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalExcluir" class="btn btn-danger btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-trash-alt"></i> Excluir
	                    </button>
                	</div>
               </td>
            </tr>
            <tr>
                <td>Criptomoeda</td>
            	<td>Ethereum</td>
            	<td>R$ 3.000</td>
                <td>01/08/2024</td>
                <td>Indefinido</td>
                <td>
                  	<div class="d-flex justify-content-between">
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalEditar" class="btn btn-secondary btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-edit"></i> Editar
	                    </button>
	                    <button type="button" data-bs-toggle="modal" data-bs-target="#ModalExcluir" class="btn btn-danger btn-sm flex-fill me-3 ms-3">
	                        <i class="fas fa-trash-alt"></i> Excluir
	                    </button>
                	</div>
               </td>
            </tr>
            <tr>
                <td></td>
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
            <!-- Adicione mais linhas conforme necess rio -->
        </tbody>
    </table>
	
	 <!-- Modal Excluir-->
	<div class="modal fade " id="ModalExcluir" tabindex="-1" aria-labelledby="ModalExcluir" aria-hidden="true">
	  <div class="modal-dialog modal-sm">
	    <div class="modal-content">
	      	<div class="modal-header">
		        <h5 class="modal-title" id="ModalExcluir">Excluir investimento?</h5>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      	</div>
	      	<div class="modal-body">
	      		<div class="container mt-2">
			        <table class="table">
			            <tr>
			                <th>Data</th>
			                <td>27/03/2024</td>
			            </tr>
			            <tr>
			                <th>Conclusão</th>
			                <td>27/03/2025</td>
			            </tr>
			            <tr>
			                <th>Nome</th>
			                <td>Criptomoeda</td>
			            </tr>
			            <tr>
			                <th>Descrição</th>
			                <td>Ethereum</td>
			            </tr>
			            <tr>
			                <th>Valor</th>
			                <td>R$ 1500,00</td>
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
		        <h5 class="modal-title" id="ModalEditar">Editar investimento</h5>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <form> 
			    <div class="modal-body my-5 mx-5">
			       		<div class="form-group row mb-0">
	                     	<div class="col-sm-6 form-group mb-4">
	                     		<label>Nome</label>
	                            <input type="text" name="Valor" class="form-control" id="ValorAdicionar"
					                   value="Criptomoeda" required>
	                     	</div>
                             <div class="col-sm-6 mb-4">
                             	<label>Valor</label>
                             	<div class="input-group">
				                    <div class="input-group-prepend">
				                        <span class="input-group-text">R$</span>
				                    </div>
				                    <input type="number" name="Valor" class="form-control" id="ValorEditar"
				                           step="0.01" min="0" value="1500" required>
				                </div>
                             </div>
	                        <div class="form-group mb-4">
	                        	<label>Descrição</label>
	                            <textarea name="Descricao" class="form-control form-control-user"
	                                id="DescricaoEditar" style="resize: vertical" required>Ethereum</textarea>
	                     	</div>
                             <div class="col-sm-6 mb-sm-0">
                             	<label>Data de início</label>
                                <input type="date" name="DataInicio" class="form-control form-control-user" id="DataIEditar"
                                     value="2024-03-27" required>
                             </div>
                             <div class="col-sm-6 mb-sm-0">
                             	<label>Data da conclusão</label>
                                <input type="date" name="DataConclusao" class="form-control form-control-user" id="DataCEditar"
                                     value="2025-03-27" required>
                             </div>
                        </div>
			    </div>
			    <div class="modal-footer">
				      <button type="button" class="btn btn-outline-danger" data-bs-dismiss="modal">Cancelar</button>
				      <button type="submit" class="btn btn-primary"><i class="fas fa-edit"></i> Salvar</button>
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
		        <h5 class="modal-title" id="ModalAdicionar">Adicionar investimento</h5>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <form> 
			    <div class="modal-body my-5 mx-5">
			       		<div class="form-group row mb-0">
	                     	<div class="col-sm-6 form-group mb-4">
	                     		<label>Nome</label>
	                            <input type="text" name="Valor" class="form-control" id="ValorAdicionar"
					                   required>
	                     	</div>
                             <div class="col-sm-6 mb-4">
                             	<label>Valor</label>
                             	<div class="input-group">
				                    <div class="input-group-prepend">
				                        <span class="input-group-text">R$</span>
				                    </div>
				                    <input type="number" name="Valor" class="form-control" id="ValorEditar"
				                           step="0.01" min="0" required>
				                </div>
                             </div>
	                        <div class="form-group mb-4">
	                        	<label>Descrição</label>
	                            <textarea name="Descricao" class="form-control form-control-user"
	                                id="DescricaoEditar" style="resize: vertical" required></textarea>
	                     	</div>
                             <div class="col-sm-6 mb-sm-0">
                             	<label>Data de início</label>
                                <input type="date" name="DataInicio" class="form-control form-control-user" id="DataIEditar"
                                       required>
                             </div>
                             <div class="col-sm-6 mb-sm-0">
                             	<label>Data da conclusão</label>
                                <input type="date" name="DataConclusao" class="form-control form-control-user" id="DataCEditar"
                                       required>
                             </div>
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
            
    
    <%@include file="footer.jsp" %>
	
	<%@include file="scripts.jsp" %>
</body>
</html>