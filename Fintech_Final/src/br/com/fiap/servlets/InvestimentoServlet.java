package br.com.fiap.servlets;

import br.com.fiap.fintech.bean.Investimento;
import br.com.fiap.fintech.bean.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/investimento")
public class InvestimentoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private OracleInvestimentoDAO dao = new OracleInvestimentoDAO();

    public InvestimentoServlet() {
        // Default constructor
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("investimentos", investimentos);
        request.getRequestDispatcher("investimento.jsp").forward(request, response);
   }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try{
			int invest = request.getParameter("invest");
			int login = request.getParameter("login");
			String nm_invest = request.getParameter("nm_invest");
			float vl_invest = request.getParameter("vl_invest");
			String ds_invest = request.getParameter("ds_invest");
			LocalDate dt_invest = LocalDate.now();
			LocalDate dt_conclusao = LocalDate.now();
			
			
			Investimento investimento = new Investimento(invest, login, nm_invest, vl_invest, ds_invest, dt_invest, dt_conclusao); 
			dao.cadastrar(login);
			
			InvestimentoDAO dao = new OracleInvestimentoDAO();
			dao.cadastrar(investimento);

			request.setAttribute("mensagem", "Investimento cadastrado com sucesso!");
			RequestDispatcher rd = request.getRequestDispatcher("investimento.jsp");
			rd.forward(request, response);

		} catch (DBException e) {
			request.setAttribute("mensagem", "Erro ao cadastrar investimento: " + e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("erro.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensagem", "Erro ao cadastrar investimento: " + e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("erro.jsp");
			rd.forward(request, response);
		}
	}
}
            

           

