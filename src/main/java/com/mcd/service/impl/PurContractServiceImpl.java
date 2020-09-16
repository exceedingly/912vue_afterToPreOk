package com.mcd.service.impl;

import com.mcd.mapper.PurContractMapper;
import com.mcd.pojo.DTO.PurContractDb;
import com.mcd.service.PurContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurContractServiceImpl implements PurContractService {
    @Autowired
    PurContractMapper purContractMapper;


    @Override
    public void insPurContract(PurContractDb purContractDb) {
        purContractMapper.inscargo(purContractDb);
    }
}
