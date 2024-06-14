package br.com.fiap.servlets;

import java.time.LocalDate;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.fintech.bean.Login;
import br.com.fiap.fintech.dao.impl.OracleLoginDAO;
import br.com.fiap.fintech.factory.DAOFactory;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private OracleLoginDAO dao;

	public LoginServlet() {
		dao = DAOFactory.getLoginDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.invalidate();
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");

		switch (acao) {
		case "cadastrar":
			cadastrar(request, response);
			break;
		case "validar":
			try {
				validar(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();

			}
			break;

		case "excluir":
			break;
		}
	}

	private void validar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("Email");
		String senha = request.getParameter("Senha");

		Login login = new Login();
		login.setDs_email(email);
		login.setDs_senha(senha);

		if (dao.validar(login)) {

			HttpSession session = request.getSession();
			session.setAttribute("user", email);

			String mensagem = "Um login foi realizado";

		} else {
			request.setAttribute("erro", "Usuário e/ou senha inválidos");
		}
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			
			String primeiroNome = request.getParameter("Nome");
			String segundoNome = request.getParameter("Sobrenome");
			String nome = primeiroNome + " " + segundoNome;
			String email = request.getParameter("Email");
			String senha = request.getParameter("Senha");
			String repetirSenha = request.getParameter("RepetirSenha");
			double saldo = 0;
			LocalDate dt_criacao = LocalDate.now();

			if (senha == null || repetirSenha == null || !senha.equals(repetirSenha)) {
				request.setAttribute("erroSenha", "As senhas não coincidem!");
				request.getRequestDispatcher("register.jsp").forward(request, response);
				
			} else {
				Login login = new Login(0, nome, email, senha, saldo, dt_criacao);
				dao.cadastrar(login);
			}

			request.setAttribute("msg", "Usuário cadastrado!");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}
}