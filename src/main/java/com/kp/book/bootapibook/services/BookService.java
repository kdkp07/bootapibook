package com.kp.book.bootapibook.services;

import org.springframework.stereotype.Service;

import com.kp.book.bootapibook.model.Book;

import java.util.*;

@Service
public class BookService {
    private static List<Book> books= new ArrayList<>();
    static{
        books.add(new Book(12,"Java Advanced","AVC"));
        books.add(new Book(13,"C++ Advanced","XYH"));
        books.add(new Book(234,"Python basics","MNL"));    
    }

    public List<Book> getBooks(){
        return books;
    }

}
