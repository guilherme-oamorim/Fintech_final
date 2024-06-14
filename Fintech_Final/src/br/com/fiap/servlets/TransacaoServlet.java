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
	        int id_login = Integer.parseInt(request.getParameter("Login"));
	        int id_categoria = Integer.parseInt(request.getParameter("categoria"));
	        LocalDate dt_transacao = LocalDate.parse(request.getParameter("dt_Transacao"));
	        float vl_transacao = Float.parseFloat(request.getParameter("vl_transacao"));
	        String ds_transacao = request.getParameter("ds_transacao");

	        Transacao transacao = new Transacao(0, id_login, id_categoria, dt_transacao, vl_transacao, ds_transacao);
	        dao.cadastrar(transacao);

	        request.setAttribute("msg", "Transação cadastrada com sucesso!");
	    }catch(Exception e){
	        e.printStackTrace();
	        request.setAttribute("erro","Erro ao cadastrar transação");
	    }
	    request.getRequestDispatcher("cadastrarTransacao.jsp").forward(request, response);
	}
}