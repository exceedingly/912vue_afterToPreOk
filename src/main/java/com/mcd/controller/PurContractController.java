package com.mcd.controller;

import com.mcd.pojo.PurContract;
import com.mcd.service.impl.PurContractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class PurContractController {

    @Autowired
    PurContractServiceImpl purContractService;







    @PostMapping("/inspurontract")
    @CrossOrigin
    public void addBook(@RequestBody PurContract purContractDb , HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println(purContractDb);


    }


}
