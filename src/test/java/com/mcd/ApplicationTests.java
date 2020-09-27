package com.mcd;

import com.mcd.mapper.UserMapper;
import com.mcd.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
   @Autowired
    UserMapper userMapper;


    @Test
    public void test(){
        User user = new User();
        user.setId(7);
        user.setUsername("wu");
        user.setPassword("ls");

        userMapper.
        ;

    }



//    @Autowired
//    PoBaseMapper poBaseMapper;
//    @Autowired
//    CargoMapper cargoMapper;
//
//
//    @Test
//    void contextLoads() {
//        System.out.println(poBaseMapper.selPoBaseByPoid(BigInteger.valueOf(11)));
//        System.out.println(cargoMapper.selCargoByPOID(BigInteger.valueOf(11)));
//
//
//    }

}
