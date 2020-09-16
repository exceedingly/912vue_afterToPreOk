package com.mcd.mapper;

import com.mcd.pojo.Books;
import com.mcd.pojo.DTO.CargoToDb;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface CargoMapper {

    @Select("select * from cargo")
    List<Books> selAll();

    @Insert("insert into cargo(style,snumber,count,price,amount,remark,pid) values(#{style},#{snumber},#{count},#{price},#{amount},#{remark},#{pid})")
    int inscargo(CargoToDb cargoToDb);

    @Select("select * from cargo where pid = #{id}")
    List<CargoToDb> selCargoByPOID(BigInteger id);

    @Delete("delete from cargo where pid = #{id} ")
    int deleteCargoToDbByid(BigInteger id);

}
