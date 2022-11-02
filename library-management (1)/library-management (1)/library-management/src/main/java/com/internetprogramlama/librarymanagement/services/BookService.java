package com.internetprogramlama.librarymanagement.services;

import com.internetprogramlama.librarymanagement.entities.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book saveBook(Book book);

    Book get(long id);




    List<Book> getByKeyword(String keyword);
}
