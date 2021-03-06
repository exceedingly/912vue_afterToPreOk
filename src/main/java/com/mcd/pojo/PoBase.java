package com.mcd.pojo;

import com.mcd.pojo.DTO.Cargo;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

public class PoBase {
    private BigInteger id;
    private String name;
    private Date shipdate;

    private Date paydate;
    private String pay;
    private String country;

    private String port;
    private String transportation;
    private Integer status;

    private String result;
    private List<Cargo> cargotable;

    public PoBase(BigInteger id, String name, Date shipdate, Date paydate, String pay, String country, String port, String transportation, Integer status, String result, List<Cargo> cargotable) {
        this.id = id;
        this.name = name;
        this.shipdate = shipdate;
        this.paydate = paydate;
        this.pay = pay;
        this.country = country;
        this.port = port;
        this.transportation = transportation;
        this.status = status;
        this.result = result;
        this.cargotable = cargotable;
    }

    @Override
    public String toString() {
        return "PoBase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shipdate=" + shipdate +
                ", paydate=" + paydate +
                ", pay='" + pay + '\'' +
                ", country='" + country + '\'' +
                ", port='" + port + '\'' +
                ", transportation='" + transportation + '\'' +
                ", status=" + status +
                ", result='" + result + '\'' +
                ", cargotable=" + cargotable +
                '}';
    }

    public PoBase() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getShipdate() {
        return shipdate;
    }

    public void setShipdate(Date shipdate) {
        this.shipdate = shipdate;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Cargo> getCargotable() {
        return cargotable;
    }

    public void setCargotable(List<Cargo> cargotable) {
        this.cargotable = cargotable;
    }
}
