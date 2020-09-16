package com.mcd.pojo;

import java.sql.Date;

public class PurExpectID {
    private String contractID;
    private String supplier;

    private Date contractdate;
    private String tyle;
    private String tyletype;

    private Integer number;
    private Integer price ;
    private Integer money ;

    private Integer status ;
    private String result ;

    public PurExpectID(String contractID, String supplier, Date contractdate, String tyle, String tyletype, Integer number, Integer price, Integer money, Integer status, String result) {
        this.contractID = contractID;
        this.supplier = supplier;
        this.contractdate = contractdate;
        this.tyle = tyle;
        this.tyletype = tyletype;
        this.number = number;
        this.price = price;
        this.money = money;
        this.status = status;
        this.result = result;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getContractdate() {
        return contractdate;
    }

    public void setContractdate(Date contractdate) {
        this.contractdate = contractdate;
    }

    public String getTyle() {
        return tyle;
    }

    public void setTyle(String tyle) {
        this.tyle = tyle;
    }

    public String getTyletype() {
        return tyletype;
    }

    public void setTyletype(String tyletype) {
        this.tyletype = tyletype;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
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

    @Override
    public String toString() {
        return "PurExpectID{" +
                "contractID='" + contractID + '\'' +
                ", supplier='" + supplier + '\'' +
                ", contractdate=" + contractdate +
                ", tyle='" + tyle + '\'' +
                ", tyletype='" + tyletype + '\'' +
                ", number=" + number +
                ", price=" + price +
                ", money=" + money +
                ", status=" + status +
                ", result='" + result + '\'' +
                '}';
    }
}
