package com.ews.util;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class ChineseFilter implements Filter {
	private FilterConfig filterConfig;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	/**
	 * 解决中文问题.（对于post方法提交的请求适用）
	 * 
	 */
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain filterChain) {
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse res = (HttpServletResponse) response;
			String path = ((HttpServletRequest) request).getServletPath();			
			int tempint = 0;
			String tempString = req.getQueryString();
			if (tempString != null) {
				String[] weiStrings = { "'", ";", "exec", "update", "script", "request", "char", "and", "chr" };
				for (int i = 0; i < weiStrings.length; i++) {
					if (tempString.contains(weiStrings[i]))
						tempint++;
				}
				if (tempint > 0)
					res.sendRedirect(req.getContextPath() + "/inc/exception.jsp");
			}
			if (1==1) {
				filterChain.doFilter(request, response);
			} else {
				if (1==2) {
					res.sendRedirect(req.getContextPath() + "/inc/exception.jsp");
				} else {
						filterChain.doFilter(request, response);
				}
			}

		} catch (Exception iox) {
			filterConfig.getServletContext().log(iox.getMessage());
		}
	}

	public void destroy() {
	}
}
