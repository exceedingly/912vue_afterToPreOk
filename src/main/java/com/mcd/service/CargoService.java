package com.mcd.service;

import com.mcd.pojo.DTO.Cargo;
import com.mcd.pojo.PoBase;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public interface CargoService {
    void inscargo(List<Cargo> cargos, BigInteger pid);

    PoBase selCargoByPOID(BigInteger id);

    void deleteCargoToDbByid(BigInteger id);
}
