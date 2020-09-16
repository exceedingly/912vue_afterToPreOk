package com.mcd;

import com.mcd.mapper.CargoMapper;
import com.mcd.mapper.PoBaseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;

@SpringBootTest
class ApplicationTests {
    @Autowired
    PoBaseMapper poBaseMapper;
    @Autowired
    CargoMapper cargoMapper;


    @Test
    void contextLoads() {
        System.out.println(poBaseMapper.selPoBaseByPoid(BigInteger.valueOf(11)));
        System.out.println(cargoMapper.selCargoByPOID(BigInteger.valueOf(11)));


    }

}
