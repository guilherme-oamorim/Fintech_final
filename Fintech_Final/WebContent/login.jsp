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

    <title>Login</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="resources/css/sb-admin-2.css" rel="stylesheet">
    <%@include file="styles.jsp" %>

<head>

<body style="background-color: #353535;">


    <div class="container">
        <!-- Outer Row -->
        <div class="row justify-content-center">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-block bg-register-image"></div>
                            <div class="col-lg-6">
								<a href="index.jsp" class="btn btn-primary mx-2 my-3"><i class="fa-solid fa-reply"></i></a>
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-white mb-4"> Bem vindo!</h1>
                                    </div>
                                    <form class="user" action="login" method="post">
                                    <input type="hidden" value="validar" name="acao">
                                        <div class="form-group">
                                            <input type="email" name="Email" class="form-control form-control-user"
                                                id="exampleInputEmail" aria-describedby="emailHelp"
                                                placeholder="Endereço de email" required>
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="Senha" class="form-control form-control-user"
                                                id="exampleInputPassword" placeholder="Senha" required>
                                        </div>
                                        <div class="form-group">
                                            <div class="custom-control custom-checkbox small" >
                                                <input type="checkbox" class="custom-control-input" id="customCheck">
                                                <label class="custom-control-label" for="customCheck">Lembre de mim</label>
                                            </div>
                                        </div>
                                        <c:if test="${not empty erro}">
                                        	<span class="text-danger ms-4" style="font-size: 14px"> ${erro} </span>
                                        </c:if>
                                    <input type="submit" id="submit" value="Login" class="text- mt-3 mb-2 py-3 btn btn-primary btn-user btn-block text-uppercase"
                                  style="font-weight: bold">
                                    <hr>
                                    <!--<div class="text-center">
                                        <a class="small" href="forgot-password.jsp">Esqueceu sua senha?</a>
                                    </div>-->
                                    <div class="text-center" id="link">
                                        <a class="small" href="register.jsp">Ainda não possui conta? Crie uma!</a>
                                    </div>
									</form>
                                </div>
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
