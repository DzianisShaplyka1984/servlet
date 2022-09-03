package com.academy.controller;

import com.academy.service.SecurityService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter writer = resp.getWriter();

    writer.println("<html>");
    writer.println("<body>");


    writer.println("Hello world!");
    writer.println("Hi world!");

    writer.println("</body>");
    writer.println("</html>");
  }

}
