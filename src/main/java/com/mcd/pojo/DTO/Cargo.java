package com.mcd.pojo.DTO;

public class Cargo {
    private String style;
    private  String snumber;
    private long count;
    private long price;
    private long amount;
    private String remark;

    public Cargo() {
    }

    public Cargo(String style, String snumber, long count, long price, long amount, String remark) {
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
}
