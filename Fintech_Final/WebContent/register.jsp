<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Cadastro</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="resources/css/sb-admin-2.css" rel="stylesheet">
    <%@include file="styles.jsp" %>

</head>

<body style="background-color: #353535;">
    <div class="container">

        <div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">
                <!-- Nested Row within Card Body -->
                <div class="row">
                    <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                    <div class="col-lg-7">
                        <div class="pt-5 px-5 pb-4">
                            <div class="text-center">
                                <h1 class="h4 text-white mb-5">Crie uma conta!</h1>
                            </div>
                            <c:if test="${not empty msg }">
								<div class="alert alert-success">${msg}</div>
							</c:if>
							<c:if test="${not empty erro }">
								<div class="alert alert-danger">${erro}</div>
							</c:if>
                            <form class="user pb-5" action="login" method="post">
                            <input type="hidden" value="cadastrar" name="acao">
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" name="Nome" class="form-control form-control-user" id="Nome"
                                            placeholder="Primeiro nome" required>
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="text" name="Sobrenome" class="form-control form-control-user" id="Sobrenome"
                                            placeholder="Sobrenome" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="email" name="Email" class="form-control form-control-user" id="Email"
                                        placeholder="E-mail" required>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="password" name="Senha" class="form-control form-control-user"
                                            id="Senha" placeholder="Senha" required>
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="password" name="RepetirSenha" class="form-control form-control-user"
                                            id="RepetirSenha" placeholder="Repita sua senha" required>
                                            <c:if test="${not empty erroSenha }">
                                            <div class="mt-1 small text-danger text-center">${erroSenha}</div>
                                    		</c:if>
                                    </div>
                                    
                                </div>
                                
                                <input type="submit" id="submit" value="Registrar conta" class="text- mt-3 mb-2 py-3 btn btn-primary btn-user btn-block text-uppercase"
                                  style="font-weight: bold">
                                  
                                <div class="text-center">
                            		<a class="small" href="forgot-password.html">Esqueceu sua senha?</a>
	                        	</div>
                            </form>
                            <div class="text-center">
                                <a class="small" href="login.html"
                                style="font-weight: bold">Já tem uma conta? Faça o login por aqui!</a>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
	<%@include file="footer.jsp" %>
	<%@include file="scripts.jsp" %>
    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

</body>

</html>