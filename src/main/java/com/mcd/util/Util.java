package com.mcd.util;

import com.mcd.pojo.DTO.Cargo;
import com.mcd.pojo.DTO.CargoToDb;
import com.mcd.pojo.DTO.PoBaseToDb;
import com.mcd.pojo.PoBase;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public List PoBaseToCargoDbAndPobaseDb(PoBase poBase){
        PoBaseToDb poBaseToDb =new PoBaseToDb();
        poBaseToDb.setStatus(poBase.getStatus());
        poBaseToDb.setTransportation(poBase.getTransportation());
        poBaseToDb.setResult(poBase.getResult());

        poBaseToDb.setPort(poBase.getPort());
        poBaseToDb.setPay(poBase.getPay());
        poBaseToDb.setPaydate(poBase.getPaydate());

        poBaseToDb.setShipdate(poBase.getShipdate());
        poBaseToDb.setName(poBase.getName());
        poBaseToDb.setId(poBase.getId());
        poBaseToDb.setCountry(poBase.getCountry());

        List<CargoToDb> cargoToDb = new ArrayList<>();
        for(int i = 0 ; i <poBase.getCargotable().size();i++){
           CargoToDb cargoToDb1 = new CargoToDb();
           cargoToDb1.setPid(poBase.getId());
           cargoToDb1.setStyle(poBase.getCargotable().get(i).getStyle());
           cargoToDb1.setSnumber(poBase.getCargotable().get(i).getSnumber());

           cargoToDb1.setRemark(poBase.getCargotable().get(i).getRemark());
           cargoToDb1.setPrice(poBase.getCargotable().get(i).getPrice());
           cargoToDb1.setCount(poBase.getCargotable().get(i).getCount());
           cargoToDb1.setAmount(poBase.getCargotable().get(i).getAmount());


           cargoToDb.add(cargoToDb1);
        }

      List list = new ArrayList();
        list.add(cargoToDb);
        list.add(poBaseToDb);
        return list;

    }
    public PoBase PobaseDbAndPoBaseToCargoDb(PoBaseToDb poBaseToDb, List<CargoToDb> poBase){
        List<Cargo> cargos = new ArrayList<>();

        for(int i =  0 ;i< cargos.size();i++){
            Cargo cargo = new Cargo();
            cargo.setStyle(poBase.get(i).getStyle());
            cargo.setSnumber(poBase.get(i).getSnumber());
            cargo.setRemark(poBase.get(i).getRemark());

            cargo.setPrice(poBase.get(i).getPrice());
            cargo.setCount(poBase.get(i).getCount());
            cargo.setAmount(poBase.get(i).getAmount());

            cargos.add(cargo);

        }

        PoBase poBase1 = new PoBase();
        poBase1.setId(poBaseToDb.getId());
        poBase1.setName(poBaseToDb.getName());
        poBase1.setShipdate(poBaseToDb.getShipdate());

        poBase1.setPaydate(poBaseToDb.getPaydate());
        poBase1.setPay(poBaseToDb.getPay());
        poBase1.setCountry(poBaseToDb.getCountry());

        poBase1.setPort(poBaseToDb.getPort());
        poBase1.setTransportation(poBaseToDb.getTransportation());
        poBase1.setStatus(poBaseToDb.getStatus());

        poBase1.setResult(poBaseToDb.getResult());
        poBase1.setCargotable(cargos);

        return poBase1;



    }
}
