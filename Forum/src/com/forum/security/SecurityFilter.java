package com.forum.security;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecurityFilter implements Filter {

	public SecurityFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest re = (HttpServletRequest) request;
		HttpServletResponse rs = (HttpServletResponse) response;
		String url = re.getRequestURI();
		System.out.println("url:" + url);
		if (url.equals("/Forum/login.jsf") || url.equals("/Forum/home.jsf") || url.equals("/Forum/registration.jsf")
				|| re.getSession().getAttribute("username") != null) {
			chain.doFilter(request, response);
		} else {
			rs.sendRedirect("/Forum/login.jsf");
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
