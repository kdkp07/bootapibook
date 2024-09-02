package com.kp.book.bootapibook.services;

import org.springframework.stereotype.Service;

import com.kp.book.bootapibook.model.Book;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class BookService {
    private static List<Book> books= new ArrayList<>();
    static{
        books.add(new Book(12,"Java Advanced","AVC"));
        books.add(new Book(13,"C++ Advanced","XYH"));
        books.add(new Book(234,"Python basics","MNL"));    
    }
    // get all books
    public List<Book> getBooks(){
        return books;
    }

    // get a single book by id
    public Book getBookById(int id){
        return books.stream().filter(e-> e.getId()==id).findFirst().orElse(null);
    }

    // add a new book
    public Book addBook(Book b){
        books.add(b);
        return b;
    }

    // delete a book
    public void deleteBook(int id){
        // for(var it : books){
        //     if(it.getId()==id){
        //         books.remove(it);
        //     }
        // }
        books = books.stream().filter(book->book.getId()!=id).collect(Collectors.toList());
        // return books;
    }
}
