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
                <div class="col-lg-4 col-sm-6">
                    <a class="portfolio-box"
                        href="resources/assets/img/portfolio/fullsize/familia-fofa-brincando-em-um-campo-de-verao.jpg"
                        title="Todos podem contribuir e acompanhar os gastos de forma fácil">
                        <img class="img-fluid"
                            src="resources/assets/img/portfolio/thumbnails/familia-fofa-brincando-em-um-campo-de-verao.jpg"
                            alt="..." />
                        <div class="portfolio-box-caption">
                            <div class="project-category text-white-50">Integração familiar</div>
                            <div class="project-name">Todos podem contribuir e acompanhar os gastos de forma fácil</div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a class="portfolio-box"
                        href="resources/assets/img/portfolio/fullsize/feliz-jovem-africano-sentado-coworking.jpg"
                        title="Tudo num lugar só">
                        <img class="img-fluid"
                            src="resources/assets/img/portfolio/thumbnails/feliz-jovem-africano-sentado-coworking.jpg"
                            alt="..." />
                        <div class="portfolio-box-caption">
                            <div class="project-category text-white-50">Gerenciamento de investimentos</div>
                            <div class="project-name">Tudo num lugar só</div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a class="portfolio-box"
                        href="resources/assets/img/portfolio/fullsize/happy-couple-analyzing-their-home-budget-while-paying-bill-computer.jpg"
                        title="Uma leitura clara da evolução do seu portfólio.">
                        <img class="img-fluid"
                            src="resources/assets/img/portfolio/thumbnails/happy-couple-analyzing-their-home-budget-while-paying-bill-computer.jpg"
                            alt="..." />
                        <div class="portfolio-box-caption">
                            <div class="project-category text-white-50">Histórico de despesas</div>
                            <div class="project-name">Uma leitura clara da evolução do seu portfólio</div>
                        </div>
                    </a>
                </div>
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
            <div class="row gx-4 gx-lg-5 justify-content-center mb-5">
                <div class="col-lg-6">
                    <form id="contactForm" data-sb-form-api-token="API_TOKEN">
                        <!-- Nome-->
                        <div class="form-floating mb-3">
                            <input class="form-control" id="name" type="text" placeholder="Coloque seu nome..."
                                data-sb-validations="required" />
                            <label for="name">Nome Completo</label>
                            <div class="invalid-feedback" data-sb-feedback="name:required">O nome é obrigatório.</div>
                        </div>
                        <!-- E-mail-->
                        <div class="form-floating mb-3">
                            <input class="form-control" id="email" type="email" placeholder="nome@exemplo.com"
                                data-sb-validations="required,email" />
                            <label for="email">E-mail</label>
                            <div class="invalid-feedback" data-sb-feedback="email:required">O e-mail é obrigatório.
                            </div>
                            <div class="invalid-feedback" data-sb-feedback="email:email">E-mail inválido.</div>
                        </div>
                        <!-- Mensagem de sucesso no cadastro-->
                        <div class="d-none" id="submitSuccessMessage">
                            <div class="text-center mb-3">
                                <div class="fw-bolder">Cadastro bem sucedido!</div>
                                Enviamos uma mensagem no seu e-mail com mais informações. 
                                <br />
                                <a
                                    href="">Reenviar e-mail</a>
                            </div>
                        </div>
                        <!-- Mensagem de erro no cadastro-->
                        <div class="d-none" id="submitErrorMessage">
                            <div class="text-center text-danger mb-3">Erro ao enviar menssagem!</div>
                        </div>
                        <!-- Botão de cadastro-->
                        <div class="d-grid"><button class="btn btn-primary btn-xl disabled" id="submitButton"
                                type="submit">Quero me cadastrar</button></div>
                    </form>
                </div>
            </div>
            <div class="row gx-4 gx-lg-5 justify-content-center">
                <div class="col-lg-4 text-center mb-5 mb-lg-0">
                    <i class="bi-phone fs-2 mb-3 text-muted"></i>
                    <div>Caso já tenha o login, basta ir pelo app.</div>
                </div>
            </div>
        </div>
    </section>
    
    <%@include file="footer.jsp" %>
	
	<%@include file="script.jsp" %>
</body>
</html>