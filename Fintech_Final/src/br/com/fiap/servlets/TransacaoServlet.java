package br.com.fiap.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.fintech.bean.Transacao;
import br.com.fiap.fintech.dao.impl.OracleTransacaoDAO;
import br.com.fiap.fintech.exception.DBException;
import br.com.fiap.fintech.factory.DAOFactory;

/**
 * Servlet implementation class TransacaoServlet
 */
@WebServlet("/TransacaoServlet")
public class TransacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private OracleTransacaoDAO dao;
	
	public TransacaoServlet() {
    	dao = DAOFactory.getTransacaoDAO();
    }
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String acao = request.getParameter("acao");
		
		switch (acao) {
		case "cadastrar":
			cadastrar(request, response);
			break;
		case "validar":
			break;
		case "excluir":
			//excluir(request, response);
			break;
		}
		
		doGet(request, response);
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try{

			String primeiroNome = request.getParameter("Nome");
			String segundoNome = request.getParameter("Sobrenome");
			String nome = primeiroNome + " " + segundoNome;
			String email = request.getParameter("Email");
			String senha = request.getParameter("Senha");
			String ds_transacao = request.getParameter("RepetirSenha");
			double vl_transacao = 0;
			LocalDate dt_transacao = LocalDate.now();
			Transacao transacao = new Transacao(); 
			dao.cadastrar(transacao);
	        

			request.setAttribute("msg", "Usuário cadastrado!");
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("erro","Por favor, valide os dados");
		}
		request.getRequestDispatcher("register.jsp").forward(request, response);
		
	}

}
