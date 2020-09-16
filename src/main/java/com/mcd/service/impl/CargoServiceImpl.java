package com.mcd.service.impl;

import com.mcd.mapper.CargoMapper;
import com.mcd.mapper.PoBaseMapper;
import com.mcd.pojo.DTO.Cargo;
import com.mcd.pojo.DTO.CargoToDb;
import com.mcd.pojo.DTO.PoBaseToDb;
import com.mcd.pojo.PoBase;
import com.mcd.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class CargoServiceImpl implements CargoService {
    @Autowired
    CargoMapper cargoMapper;
    @Autowired
    PoBaseMapper poBaseMapper;


    @Override
    public void inscargo(List<Cargo> cargo, BigInteger pid) {
        //加工cargo 变为cargoToDB
        for(int i = 0 ; i <cargo.size();i++){
            CargoToDb cargoToDb1 =new CargoToDb();
            cargoToDb1.setAmount(cargo.get(i).getAmount());
            cargoToDb1.setCount(cargo.get(i).getCount());
            cargoToDb1.setPrice(cargo.get(i).getPrice());
            cargoToDb1.setRemark(cargo.get(i).getRemark());
            cargoToDb1.setSnumber(cargo.get(i).getSnumber());
            cargoToDb1.setStyle(cargo.get(i).getStyle());
            cargoToDb1.setPid(pid);

            //放入数据库
            cargoMapper.inscargo(cargoToDb1);

        }






    }

    @Override
    public PoBase  selCargoByPOID(BigInteger id) {
        List<CargoToDb> cargoToDbs = cargoMapper.selCargoByPOID(id);
        PoBaseToDb poBaseToDb = poBaseMapper.selPoBaseByPoid(id);
        PoBase poBase = new PoBase();


        List<Cargo> cargos = new ArrayList<>();

        for(int i = 0 ; i <cargoToDbs.size();i++){
            Cargo cargo =new Cargo();
            cargo.setAmount(cargoToDbs.get(i).getAmount());
            cargo.setCount(cargoToDbs.get(i).getCount());
            cargo.setPrice(cargoToDbs.get(i).getPrice());

            cargo.setRemark(cargoToDbs.get(i).getRemark());
            cargo.setSnumber(cargoToDbs.get(i).getSnumber());
            cargo.setStyle(cargoToDbs.get(i).getStyle());


            cargos.add(cargo);

        }


        poBase.setCargotable(cargos);
        poBase.setCountry(poBaseToDb.getCountry());
        poBase.setId(poBaseToDb.getId());
        poBase.setName(poBaseToDb.getName());
        poBase.setPay(poBaseToDb.getPay());


        poBase.setPaydate(poBaseToDb.getPaydate());
        poBase.setPort(poBaseToDb.getPort());
        poBase.setResult(poBaseToDb.getResult());
        poBase.setShipdate(poBaseToDb.getShipdate());
        poBase.setStatus(poBaseToDb.getStatus());
        poBase.setTransportation(poBaseToDb.getTransportation());






        return poBase;
    }

    @Override
    public void deleteCargoToDbByid(BigInteger id) {
         cargoMapper.deleteCargoToDbByid(id);
    }


}
