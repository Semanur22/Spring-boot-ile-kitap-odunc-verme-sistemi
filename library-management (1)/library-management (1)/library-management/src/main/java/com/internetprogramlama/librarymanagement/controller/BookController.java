package com.internetprogramlama.librarymanagement.controller;

import com.internetprogramlama.librarymanagement.entities.Book;
import com.internetprogramlama.librarymanagement.entities.BorrowedBook;
import com.internetprogramlama.librarymanagement.entities.Person;
import com.internetprogramlama.librarymanagement.services.BookService;
import com.internetprogramlama.librarymanagement.services.BorrowedBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }


    @GetMapping("/addBook")
    public String createBook(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "create_book";

    }
    @PostMapping("/addBook")
    public  String saveBook( @ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "book_succes";
    }
/*
    @GetMapping("/kitapSec")
    public String add(Model model) {

        model.addAttribute("books",bookService.getAllBooks());

        return "books";
    }


    @PostMapping("/kitapSec")
    public String doSearchEmployee(@ModelAttribute("bookSearch") Book formData, Model model) {
        Book book = bookService.get(formData.getbId());
        model.addAttribute("book", book);
        return "books";
    }
*/

    /*
    @PostMapping("/kitapSec")
    public String doSearchBook(Model model, @Param("keyword") String keyword) {
        List<Book> listProducts = bookService.listAll(keyword);
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("keyword", keyword);

        return "books";
    }*/
    /*
    @GetMapping("/kitapSec")
    public  String sea(){
        return "books"
    }
    */
    @RequestMapping("/kitapSec")
    public String search(Book book, Model model, String keyword) {
        if(keyword!=null) {
            List<Book> list = bookService.getByKeyword(keyword);
            model.addAttribute("list", list);
        }else {
            List<Book> list = bookService.getAllBooks();
            model.addAttribute("list", list);}
        return "books";
    }

    @RequestMapping("/kitapTeslim")
    public String Teslim(Book book, Model model, String keyword) {
        if(keyword!=null) {
            List<Book> list = bookService.getByKeyword(keyword);
            model.addAttribute("list", list);
        }else {
            List<Book> list = bookService.getAllBooks();
            model.addAttribute("list", list);}
        return "books";
    }


}
