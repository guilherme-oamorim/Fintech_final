<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Fintech</title>
	<%@include file="styles.jsp" %>
</head>
<body>
	<%@include file="nav.jsp"%>
	
	<!-- Home-->
	<header class="masthead">
        <div class="container px-4 px-lg-5 h-100">
            <div class="row gx-4 gx-lg-5 h-100 align-items-center justify-content-center text-center">
                <div class="col-lg-8 align-self-end">
                    <h1 class="text-white font-weight-bold">O app perfeito para finanças compartilhadas</h1>
                    <hr class="divider divider-light" />
                </div>
                <div class="col-lg-8 align-self-baseline">
                    <p class="text-white-75 mb-5">Cansado da bagunça que o caos da rotina fez com os planos financeiros da sua família? Conheça a sua nova solução Fintech!</p>
                    <a class="btn btn-primary btn-xl" href="#about">Estou interessado!</a>
                </div>
            </div>
        </div>
    </header>
    
    <!-- Sobre nós-->
    <section class="page-section bg-primary" id="about">
        <div class="container px-4 px-lg-5">
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div class="col-lg-8 text-center">
                    <h2 class="text-white mt-0">Nós temos o que você precisa!</h2>
                    <hr class="divider divider-light" />
                    <p class="text-white-75 mb-4">Conseguimos facilmente sincronizar seus dados de banco e investimentos juntamente com a integração de outros usuários na conta, te auxiliando na tomada de decisão e permitindo uma organização para suas metas futuras.</p>
                    <a class="btn btn-light btn-xl" href="#contact">Comece agora!</a>
                </div>
            </div>
        </div>
    </section>
    <!-- Para você-->
    <section class="page-section" id="services">
        <div class="container px-4 px-lg-5">
            <h2 class="text-center mt-0">Para você</h2>
            <hr class="divider" />
            <div class="row gx-4 gx-lg-5">
                <div class="col-lg-4 col-md-6 text-center">
                    <div class="mt-5">
                        <div class="mb-2"><i class="bi-people-fill fs-1 text-primary"></i></div>
                        <h3 class="h4 mb-2">Integração familiar</h3>
                        <p class="text-muted mb-0">Despesas comuns num único ambiente tornam a economia familiar simples e transparente!</p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 text-center">
                    <div class="mt-5">
                        <div class="mb-2"><i class="bi-bar-chart-fill fs-1 text-primary"></i></div>
                        <h3 class="h4 mb-2">Gerenciamento de investimentos</h3>
                        <p class="text-muted mb-0">Tenha uma visão abrangente e personalizada de todos os seus investimentos em um único painel. </p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12 text-center">
                    <div class="mt-5">
                        <div class="mb-2"><i class="bi-clipboard-data fs-1 text-primary"></i></div>
                        <h3 class="h4 mb-2">Histórico de despesas</h3>
                        <p class="text-muted mb-0">Mantenha-se atualizado com um histórico legível que mostre seu progresso financeiro.</p>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Fotos-->
    <div id="portfolio">
        <div class="container-fluid p-0">
            <div class="row g-0">
                <%@include file="index/image1.jsp" %>
                <%@include file="index/image2.jsp" %>
                <%@include file="index/image3.jsp" %>
            </div>
        </div>
    </div>
    
    <section class="page-section" id="contact">
        <div class="container px-4 px-lg-5">
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div class="col-lg-8 col-xl-6 text-center">
                    <h2 class="mt-0">Venha conosco!</h2>
                    <hr class="divider" />
                    <p class="text-muted mb-5">Coloque aqui seu nome e seu e-mail, que logo chegará uma mensagem na sua caixa sobre as etapas finais do cadastro.</p>
                </div>
            </div>
            <div class="row gx-4 gx-lg-5 justify-content-center mb-4">
                <div class="col-lg-6">
                     <div class="d-grid"><button class="btn btn-primary btn-xl" id="submitButton"
                     type="submit">Quero me cadastrar</button></div>
                </div>
            </div>
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div class="col-lg-4 text-center mb-5 mb-lg-0">
                    <div>Caso já tenha o login, <br/>
                    <a class="color-primary" style="font-weight: 700" href="#">acesse sua conta por aqui.</a></div>
                </div>
            </div>
        </div>
    </section>
    
    <%@include file="footer.jsp" %>
	
	<%@include file="scripts.jsp" %>
</body>
</html>