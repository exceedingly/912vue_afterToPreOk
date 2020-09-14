package com.mcd.pojo;

import com.mcd.pojo.DTO.Cargo;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
@Data
@AllArgsConstructor
public class PoBase {
    private Integer id;
    private String name;
    private Date shipdate;
    private Date paydate;
    private String pay;
    private String country;
    private String port;
    private String transportation;
    private Integer status;
    private String result;
    private Cargo[] cargotable;




}
