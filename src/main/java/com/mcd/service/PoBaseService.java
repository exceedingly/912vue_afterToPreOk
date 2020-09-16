package com.mcd.service;

import com.mcd.pojo.DTO.PoBaseToDb;
import com.mcd.pojo.PoBase;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public interface PoBaseService {

    void inscargo(PoBase poBase);
    List<PoBaseToDb> selPoBase();
    PoBaseToDb selPoBaseByPoid(BigInteger id);
    int deletePoBaseToDbByid(BigInteger id);

}
