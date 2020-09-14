package com.mcd.pojo.DTO;

import java.math.BigInteger;

public class Cargo {
    private String style;
    private  String snumber;
    private BigInteger count;
    private BigInteger price;
    private BigInteger amount;
    private String remark;


    public Cargo(String style, String snumber, BigInteger count, BigInteger price, BigInteger amount, String remark) {
        this.style = style;
        this.snumber = snumber;
        this.count = count;
        this.price = price;
        this.amount = amount;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "style='" + style + '\'' +
                ", snumber='" + snumber + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", amount=" + amount +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Cargo() {
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
