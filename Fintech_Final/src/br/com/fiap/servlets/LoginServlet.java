package br.com.fiap.servlets;


import java.sql.Date;
import java.time.LocalDate;
import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.com.fiap.fintech.bean.Login;
import br.com.fiap.fintech.dao.impl.OracleLoginDAO;
import br.com.fiap.fintech.exception.DBException;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private OracleLoginDAO dao = new OracleLoginDAO();
    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	//teste
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		
		switch (acao) {
		case "cadastrar":
			cadastrar(request, response);
			break;
		case "editar":
			//editar(request,response);
			break;
		case "excluir":
			//excluir(request, response);
			break;
		}
}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
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
	            request.getRequestDispatcher("/register.jsp").forward(request, response);
	        } else {
	        	Login login = new Login(0, nome, email, senha, saldo, dt_criacao); 
				dao.cadastrar(login);
	        }

			request.setAttribute("msg", "Usuário cadastrado!");
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("erro","Por favor, valide os dados");
		}
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
}











