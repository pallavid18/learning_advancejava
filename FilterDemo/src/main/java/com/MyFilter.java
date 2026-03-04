package com;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/MyFilter")
public class MyFilter extends HttpFilter implements Filter {

    public MyFilter() {
        super();
    }

	public void destroy() {
	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter pw = response.getWriter();
		pw.println("Filter is invoked Pre-Processing");
		chain.doFilter(request, response);
		pw.println("Filter is invoked Post-Processing");
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
