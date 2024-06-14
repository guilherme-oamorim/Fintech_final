package br.com.fiap.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.fintech.bean.Categoria;
import br.com.fiap.fintech.bean.Login;
import br.com.fiap.fintech.bean.Transacao;
import br.com.fiap.fintech.dao.impl.OracleCategoriaDAO;
import br.com.fiap.fintech.dao.impl.OracleLoginDAO;
import br.com.fiap.fintech.dao.impl.OracleTransacaoDAO;
import br.com.fiap.fintech.factory.DAOFactory;

@WebServlet("/transacao")
public class TransacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private OracleTransacaoDAO dao;
	private OracleCategoriaDAO categoriaDao;

	@Override
	public void init() throws ServletException {
		super.init();
		dao = DAOFactory.getTransacaoDAO();
		categoriaDao = DAOFactory.getCategoriaDAO();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");

		switch (acao) {
		case "listar":
			
			listar(request, response);
			break;
			
		case "abrir-form-edicao":
			
			abrirFormEdicao(request, response);
			break;
			
	/*	case "abrir-form-cadastro":
			
			abrirFormCadastro(request, response);
			break; */
		}
	}

/*	private void abrirFormCadastro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Categoria> lista = categoriaDao.listar();
		request.setAttribute("categorias", lista);
		request.getRequestDispatcher("transacao.jsp").forward(request, response); // checkar caminho .jsp
	} */

	private void carregarOpcoesCategoria(HttpServletRequest request) {

		List<Categoria> lista = categoriaDao.listar();
		request.setAttribute("categorias", lista);
	}

	private void abrirFormEdicao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id_transacao = Integer.parseInt(request.getParameter("id_transacao"));
		Transacao transacao = dao.buscar(id_transacao);
		request.setAttribute("transacao", transacao);
		carregarOpcoesCategoria(request);
		request.getRequestDispatcher("transacao.jsp").forward(request, response); // checkar caminho .jsp
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Transacao> lista = dao.listar();
		request.setAttribute("transacao", lista);
		request.getRequestDispatcher("transacao.jsp").forward(request, response); // checkar caminho .jsp
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");

		switch (acao) {
		case "cadastrar":

			cadastrar(request, response);
			break;

		case "editar":

			editar(request, response);
			break;

		case "excluir":

			excluir(request, response);
			break;
		}
	}

	private void excluir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id_transacao = Integer.parseInt(request.getParameter("id_transacao"));
		
		try {
			
			dao.remover(id_transacao);
			request.setAttribute("msg", "Produto removido!");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			request.setAttribute("erro", "Erro ao atualizar");
			
		}
		
		listar(request, response);
	}

	private void editar (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			int id_login = Integer.parseInt(request.getParameter("id_login"));
			int id_categoria = Integer.parseInt(request.getParameter("id_categoria"));
			LocalDate dt_transacao = LocalDate.parse(request.getParameter("dt_Transacao"));
			float vl_transacao = Float.parseFloat(request.getParameter("vl_transacao"));
			String ds_transacao = request.getParameter("ds_transacao");

			Categoria categoria = new Categoria();
			categoria.setId_categoria(id_categoria);

			Transacao transacao = new Transacao(0, id_login, id_categoria, dt_transacao, vl_transacao, ds_transacao);
			//transacao.setCategoria(categoria);

			dao.cadastrar(transacao);

			request.setAttribute("msg", "Transação atualizada com sucesso!");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			request.setAttribute("erro", "Erro ao atualizar");
			
		}
		
		listar(request, response);
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			HttpSession session = request.getSession();
			String email = session.getAttribute("user").toString();
			OracleLoginDAO loginDAO = new OracleLoginDAO();
			Login login = loginDAO.buscar(email);
			int id_login = login.getId_login();
			
			//int id_categoria = Integer.parseInt(request.getParameter("Categoria"));
			LocalDate dt_transacao = LocalDate.parse(request.getParameter("Data"));
			float vl_transacao = Float.parseFloat(request.getParameter("Valor"));
			String ds_transacao = request.getParameter("Descricao");

			//Categoria categoria = new Categoria();
			//categoria.setId_categoria(3);

			Transacao transacao = new Transacao(0, id_login,3, dt_transacao, vl_transacao, ds_transacao);
			//transacao.setCategoria(categoria);

			dao.cadastrar(transacao);

			request.setAttribute("msg", "Transação cadastrada com sucesso!");

		} catch (Exception e) {
			
			e.printStackTrace();
			request.setAttribute("erro", "Erro ao cadastrar transação");
		}

		request.getRequestDispatcher("transacao.jsp").forward(request, response);
	}
}
