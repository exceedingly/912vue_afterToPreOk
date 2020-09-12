package com.mcd.controller;

import com.alibaba.fastjson.JSON;
import com.mcd.pojo.Books;
import com.mcd.service.impl.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {
    @Autowired
    BooksServiceImpl booksService;


    @GetMapping("/hello")
    @CrossOrigin
    public String hello(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin","*");
        String s = JSON.toJSONString(booksService.selAll());
        System.out.println(s);
        return s;
    }


    @PostMapping("/add")
    @CrossOrigin
    public void addBook(@RequestBody Books books){


        System.out.println(books);
    }
}
