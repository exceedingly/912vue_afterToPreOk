package com.mcd.mapper;

import com.mcd.pojo.DTO.PurContractDb;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurContractMapper {


    @Insert("insert into pur_contract(poid,contractID,supplier,contractdate,tyle,tyletype,number,price,money,status,result) values(#{poid},#{contractID},#{supplier},#{contractdate},#{tyle},#{tyletype},#{number},#{price},#{money},#{status},#{result})")
    int inscargo(PurContractDb poBaseToDb);



}
