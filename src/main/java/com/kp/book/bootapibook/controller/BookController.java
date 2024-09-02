package com.kp.book.bootapibook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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


    // add a new book
    @PostMapping("/books")
    public Book addBook(@RequestBody Book b){
        Book book = bookService.addBook(b);
        System.out.println(book);
        return book;
    }

    // deleting a book
    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable("id") int id){
        bookService.deleteBook(id);
        return "Book with id "+id+ " deleted succesfully!!";
    }

    // update a book
    @PutMapping("/books/{id}")
    public Book updateBook(@RequestBody Book newBook , @PathVariable("id") int id){
        bookService.updateBook(newBook, id);
        return newBook;
    }

}
