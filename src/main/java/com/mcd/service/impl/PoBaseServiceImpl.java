package com.mcd.service.impl;

import com.mcd.mapper.PoBaseMapper;
import com.mcd.pojo.DTO.PoBaseToDb;
import com.mcd.pojo.PoBase;
import com.mcd.service.PoBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class PoBaseServiceImpl implements PoBaseService {
    @Autowired
    PoBaseMapper poBaseMapper;



    @Override
    public void inscargo(PoBase poBase) {
        PoBaseToDb poBaseToDb = new PoBaseToDb();

        poBaseToDb.setCountry(poBase.getCountry());
        poBaseToDb.setId(poBase.getId());
        poBaseToDb.setName(poBase.getName());

        poBaseToDb.setPay(poBase.getPay());
        poBaseToDb.setPaydate(poBase.getPaydate());
        poBaseToDb.setPort(poBase.getPort());

        poBaseToDb.setResult(poBase.getResult());
        poBaseToDb.setShipdate(poBase.getShipdate());
        poBaseToDb.setStatus(poBase.getStatus());
        poBaseToDb.setTransportation(poBase.getTransportation());


        poBaseMapper.inscargo(poBaseToDb);
    }

    @Override
    public List<PoBaseToDb> selPoBase() {
        return poBaseMapper.selPoBase();
    }

    @Override
    public PoBaseToDb selPoBaseByPoid(BigInteger id) {
        return poBaseMapper.selPoBaseByPoid(id);
    }

    @Override
    public int deletePoBaseToDbByid(BigInteger id) {
        return poBaseMapper.deletePoBaseToDbByid(id);
    }
}
