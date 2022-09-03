package com.academy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String login = req.getParameter("login");
    String password = req.getParameter("password");

    PrintWriter writer = resp.getWriter();

    writer.println("<html>");
    writer.println("<body>");

    if ("Ivan".equals(login) && "qwerty".equals(password)) {
      writer.println("Hi " + login);

      HttpSession session = req.getSession();
      session.setAttribute("user", login);
    } else {
      writer.println("Access denied");
    }

    writer.println("</body>");
    writer.println("</html>");
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String body = req.getReader().lines().collect(Collectors.joining());

    System.out.println(body);
  }
}
