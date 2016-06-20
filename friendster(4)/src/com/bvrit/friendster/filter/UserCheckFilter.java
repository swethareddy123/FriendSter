package com.bvrit.friendster.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UserCheckFilter implements Filter {

    
    public UserCheckFilter() {
        
    }

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("infilter doFilter()");
		HttpServletRequest request1 =(HttpServletRequest)request;
		HttpServletResponse response1 =(HttpServletResponse)response;
		HttpSession session = request1.getSession();
		String userid = (String)session.getAttribute("userid");
		if(userid != null){
			chain.doFilter(request, response);
			
		}else{
			( response1).sendRedirect("loginView.jsp?msg=Not logged in user,Login to continue");
		}
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}