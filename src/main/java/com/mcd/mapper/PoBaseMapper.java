package com.mcd.mapper;

import com.mcd.pojo.DTO.PoBaseToDb;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface PoBaseMapper {

    @Select("select * from po_base")
    List<PoBaseToDb> selPoBase();

    @Select("select * from po_base where id = #{id}")
    PoBaseToDb selPoBaseByPoid(BigInteger id);
    @Insert("insert into po_base(id,name,shipdate,paydate,pay,country,port,transportation,status,result) values(#{id},#{name},#{shipdate},#{paydate},#{pay},#{country},#{port},#{transportation},#{status},#{result})")
    int inscargo(PoBaseToDb poBaseToDb);

    @Delete("delete from po_base where id = #{id} ")
    int deletePoBaseToDbByid(BigInteger id);

}
