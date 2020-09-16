package com.mcd.pojo.DTO;

import java.math.BigInteger;

public class CargoToDb {
    private String style;
    private  String snumber;
    private long count;
    private long price;
    private long amount;
    private String remark;
    private BigInteger pid;

    public CargoToDb(String style, String snumber, long count, long price, long amount, String remark, BigInteger pid) {
        this.style = style;
        this.snumber = snumber;
        this.count = count;
        this.price = price;
        this.amount = amount;
        this.remark = remark;
        this.pid = pid;
    }

    public CargoToDb() {
    }

    @Override
    public String toString() {
        return "CargoToDb{" +
                "style='" + style + '\'' +
                ", snumber='" + snumber + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", amount=" + amount +
                ", remark='" + remark + '\'' +
                ", pid=" + pid +
                '}';
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

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigInteger getPid() {
        return pid;
    }

    public void setPid(BigInteger pid) {
        this.pid = pid;
    }
}
