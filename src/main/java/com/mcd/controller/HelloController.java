package com.mcd.controller;

import com.alibaba.fastjson.JSON;
import com.mcd.pojo.DTO.Cargo;
import com.mcd.pojo.PoBase;
import com.mcd.service.impl.CargoServiceImpl;
import com.mcd.service.impl.PoBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    PoBaseServiceImpl poBaseService;
    @Autowired
    CargoServiceImpl cargoService;

    @GetMapping("/gettest")

    public String gettest(HttpServletResponse response) {
        String s = JSON.toJSONString(poBaseService.selPoBase());

        return s;
    }

    @GetMapping("/hello")
    @CrossOrigin
    public String hello(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String s = JSON.toJSONString(poBaseService.selPoBase());
        System.out.println(s);
        return s;
    }


    @PostMapping("/add")
    @CrossOrigin
    public void addBook(@RequestBody PoBase poBase,HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Cargo> cargos = poBase.getCargotable();
        cargoService.inscargo(cargos,poBase.getId());
        poBaseService.inscargo(poBase);


    }

    @DeleteMapping("/DeletePobaseAndCargoById/{id}")
    @CrossOrigin
    public void deletePobaseAndCargoById(@PathVariable("id") BigInteger id,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        poBaseService.deletePoBaseToDbByid(id);
        cargoService.deleteCargoToDbByid(id);
    }






}
