package com.kp.book.bootapibook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kp.book.bootapibook.model.Book;
import com.kp.book.bootapibook.services.BookService;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    public BookService bookService;

    // get all books
    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    // get book by id
    @GetMapping("/books/{id}")
    public Book getSingleBook(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }


}
