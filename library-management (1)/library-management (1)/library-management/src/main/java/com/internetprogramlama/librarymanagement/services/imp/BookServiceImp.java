package com.internetprogramlama.librarymanagement.services.imp;

import com.internetprogramlama.librarymanagement.entities.Book;

import com.internetprogramlama.librarymanagement.respositories.BookRepository;
import com.internetprogramlama.librarymanagement.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookServiceImp(BookRepository bookRepository) {
        super();
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    @Override
    public Book get(long id){
        return  bookRepository.findById(id).get();
    }

    @Override
    public List<Book> getByKeyword(String keyword){
        return bookRepository.findByKeyword(keyword);
    }





}
