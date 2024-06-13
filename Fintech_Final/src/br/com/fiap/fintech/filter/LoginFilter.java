/*package br.com.fiap.fintech.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class LoginFilter extends HttpFilter implements Filter {
	
	private static final long serialVersionUID = 1L;

	public LoginFilter() {
		super();
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		String url = req.getRequestURI();

		// verificar nomes parametros session.etc("xxxx")
		if (session.getAttribute("user") == null && !url.endsWith("login") && !url.contains("resources")
				&& !url.contains("home")) {
			
			request.setAttribute("erro", "Entre com o usuário e senha!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			request.getRequestDispatcher("register.jsp").forward(request, response);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		
		} else {
			chain.doFilter(request, response);
			
		}
	}
}*/