package com.academy.controller;

import com.academy.model.entity.Book;
import com.academy.service.BookService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactServlet extends HttpServlet {

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.getSession().setAttribute("a", 4);

    BookService bookService = new BookService();
    List<Book> books = bookService.getBooks();

    req.setAttribute("books", books);

    req.getRequestDispatcher("/contact.jsp").forward(req, resp);

  }
}
