package com.academy.service;

import com.academy.model.entity.Book;
import java.util.ArrayList;
import java.util.List;

public class BookService {

  public List<Book> getBooks() {
    List<Book> books = new ArrayList<>();

    books.add(new Book("Java for Beginners"));
    books.add(new Book("SQL"));
    books.add(new Book("Complete code"));

    return books;
  }
}
