
package br.com.fiap.fintech.filter;

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

		if (session.getAttribute("user") == null && !url.contains("resources") && !url.contains("index") && !url.contains("login")
				&& !url.contains("register") && !url.contains("404") && !url.contains("erro") && !url.contains("investimento") && !url.contains("transacao")) {
			request.setAttribute("erro", "Usuário ou senha inválidos!");
			request.getRequestDispatcher("login.jsp").forward(request, response);

		} else {
			chain.doFilter(request, response);

		}
	}
}
