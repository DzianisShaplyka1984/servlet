package com.academy.controller;

import com.academy.model.entity.Book;
import com.academy.service.BookService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/books")
public class BookServlet extends HttpServlet {

  protected void doGet(
      HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter writer = resp.getWriter();

    writer.println("<html>");
    writer.println("<body>");

    BookService bookService = new BookService();
    List<Book> books = bookService.getBooks();

    for (Book book : books) {
      writer.println(book.getTitle() + "<br>");
    }

    writer.println("</body>");
    writer.println("</html>");
  }
}
