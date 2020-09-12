package com.mcd.controller;

import com.mcd.pojo.Books;
import com.mcd.service.impl.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    BooksServiceImpl booksService;


    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return booksService.selAll().toString();
    }


    @GetMapping("/add")
    @ResponseBody
    public int addBook(){
        Books books=new Books(1,"2",3,"4");


        return booksService.insBook(books);
    }
}
