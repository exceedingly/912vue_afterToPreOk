package com.mcd.util;

import com.mcd.mapper.PoBaseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UtilTest {
    @Autowired
    PoBaseMapper poBaseMapper;

    @Test
    void test(){


        System.out.println(poBaseMapper.selPoBase());
    }
}
