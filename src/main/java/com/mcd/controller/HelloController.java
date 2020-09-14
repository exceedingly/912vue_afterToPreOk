package com.mcd.controller;

import com.alibaba.fastjson.JSON;
import com.mcd.pojo.DTO.Cargo;
import com.mcd.pojo.PoBase;
import com.mcd.service.impl.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    BooksServiceImpl booksService;


    @GetMapping("/hello")
    @CrossOrigin
    public String hello(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String s = JSON.toJSONString(booksService.selAll());
        System.out.println(s);
        return s;
    }


    @PostMapping("/add")
    @CrossOrigin
    public void addBook(@RequestBody PoBase poBase


    ) {
        System.out.println(poBase);


    }

    @PostMapping("/add1")
    @CrossOrigin
    public void addCargoBook(@RequestBody List<Cargo> cargotable
    ) {
        System.out.println(cargotable);
    }
}
