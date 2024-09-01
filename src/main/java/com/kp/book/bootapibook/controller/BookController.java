package com.kp.book.bootapibook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/books")
    public String getBooks(){
        return "This is for testing purpose";
    }
}
