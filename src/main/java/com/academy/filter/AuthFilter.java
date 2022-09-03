package com.academy.filter;

import com.academy.service.SecurityService;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AuthFilter implements Filter {

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {

    HttpServletRequest request = (HttpServletRequest) servletRequest;

    SecurityService securityService = new SecurityService();

    if (securityService.checkIfUserLogged(request) || request.getRequestURI().contains("/login")) {
      filterChain.doFilter(servletRequest, servletResponse);
    } else {
      //redirect to login page
    }

  }
}
