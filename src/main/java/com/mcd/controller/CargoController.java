package com.mcd.controller;

import com.mcd.pojo.PoBase;
import com.mcd.service.impl.CargoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class CargoController {

    @Autowired
    CargoServiceImpl cargoService;







    @PostMapping("/selCargoByPOID/{id}")
    @CrossOrigin
    public PoBase selCargoByPOIDController(@PathVariable("id") BigInteger id) {
        PoBase poBase = cargoService.selCargoByPOID(id);
        return poBase;

    }


}
