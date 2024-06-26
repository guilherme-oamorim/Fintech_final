<nav class="navbar navbar-expand-lg navbar-light fixed-top py-3"
	id="mainNav">
	<div class="container px-4 px-lg-5">
		<a class="navbar-brand" href="index.jsp"> <svg width="70"
				height="69" viewBox="0 0 70 69" fill="none"
				xmlns="http://www.w3.org/2000/svg">
                    <path
					d="M7.68768 66V57.2727H12.9206V58.2102H8.7445V61.1591H12.5286V62.0966H8.7445V66H7.68768ZM15.7875 57.2727V66H14.7306V57.2727H15.7875ZM24.8269 57.2727V66H23.8042L19.0485 59.1477H18.9632V66H17.9064V57.2727H18.9292L23.7019 64.142H23.7871V57.2727H24.8269ZM26.4643 58.2102V57.2727H33.0098V58.2102H30.2654V66H29.2086V58.2102H26.4643ZM34.6408 66V57.2727H39.9078V58.2102H35.6976V61.1591H39.6351V62.0966H35.6976V65.0625H39.976V66H34.6408ZM48.8354 60H47.7786C47.7161 59.696 47.6067 59.429 47.4505 59.1989C47.2971 58.9688 47.1096 58.7756 46.888 58.6193C46.6692 58.4602 46.4263 58.3409 46.1593 58.2614C45.8922 58.1818 45.6138 58.142 45.324 58.142C44.7956 58.142 44.3169 58.2756 43.888 58.5426C43.4618 58.8097 43.1223 59.2031 42.8695 59.723C42.6195 60.2429 42.4945 60.8807 42.4945 61.6364C42.4945 62.392 42.6195 63.0298 42.8695 63.5497C43.1223 64.0696 43.4618 64.4631 43.888 64.7301C44.3169 64.9972 44.7956 65.1307 45.324 65.1307C45.6138 65.1307 45.8922 65.0909 46.1593 65.0114C46.4263 64.9318 46.6692 64.8139 46.888 64.6577C47.1096 64.4986 47.2971 64.304 47.4505 64.0739C47.6067 63.8409 47.7161 63.5739 47.7786 63.2727H48.8354C48.7559 63.7187 48.611 64.1179 48.4007 64.4702C48.1905 64.8224 47.9292 65.1222 47.6167 65.3693C47.3042 65.6136 46.9533 65.7997 46.5641 65.9276C46.1777 66.0554 45.7644 66.1193 45.324 66.1193C44.5797 66.1193 43.9178 65.9375 43.3382 65.5739C42.7587 65.2102 42.3027 64.6932 41.9703 64.0227C41.638 63.3523 41.4718 62.5568 41.4718 61.6364C41.4718 60.7159 41.638 59.9205 41.9703 59.25C42.3027 58.5795 42.7587 58.0625 43.3382 57.6989C43.9178 57.3352 44.5797 57.1534 45.324 57.1534C45.7644 57.1534 46.1777 57.2173 46.5641 57.3452C46.9533 57.473 47.3042 57.6605 47.6167 57.9077C47.9292 58.152 48.1905 58.4503 48.4007 58.8026C48.611 59.152 48.7559 59.5511 48.8354 60ZM50.5431 66V57.2727H51.6V61.1591H56.2534V57.2727H57.3102V66H56.2534V62.0966H51.6V66H50.5431Z"
					fill="white" />
                    <path
					d="M32.6945 19.16V26.648H19.1585V32.6H29.1425V39.752H19.1585V53H9.7505V19.16H32.6945ZM62.1448 19.16V26.648H53.1208V53H43.7128V26.648H34.7848V19.16H62.1448Z"
					fill="#FF7A00" />
                </svg>
		</a>
		<button class="navbar-toggler navbar-toggler-right" type="button"
			data-bs-toggle="collapse" data-bs-target="#navbarResponsive"
			aria-controls="navbarResponsive" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ms-auto my-2 my-lg-0">
				<c:if test="${empty user}">
					<span class="navbar-text text-danger" style="margin-right: 10px">
						${erro} </span>
					<form class="form-inline my-2 my-lg-0" action="login" method="post">
						<input type="hidden" value="validar" name="acao">
						<ul class="navbar-nav ms-auto my-2 my-lg-0">
							<li class="mx-2"><input class="form-control mr-sm-2"
								type="email" name="Email" placeholder="E-mail"></li>
							<li class="mx-2"><input class="form-control mr-sm-2"
								type="password" name="Senha" placeholder="Senha"></li>
							<li class="mx-2"><input type="submit" id="submit"
								value="Login" class="btn btn-outline-primary my-2 my-sm-0">
							</li>
						</ul>
					</form>
				</c:if>
				<c:if test="${not empty user }">
					<span class="navbar-text"> ${user} <a href="login"
						class="text-white mx-2 btn btn-outline-danger my-2 my-sm-0">Sair</a>
					</span>
				</c:if>
			</ul>
		</div>
	</div>
</nav>
