package com.mkyong.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SELL_MST")
public class SellMstEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="NO")
    private Integer no;

    @Column(name="SELL_DATE")
    private Date sellDate;

    @Column(name="PRICE")
    private int price;

    @Column(name="DISCOUNT_RATE")
    private Double discountRate;

    @Column(name="CUST_NO")
    private String custNo;

    @Column(name="BILL_NO")
    private Integer billNo;

    @Column(name="CREATE_DATE")
    private Date createDate;

    @Column(name="UPDATE_DATE")
    private Date updateDate;

    @Column(name="STATUS")
    private String status;


    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Date getSellDate() {
        return sellDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public Integer getBillNo() {
        return billNo;
    }

    public void setBillNo(Integer billNo) {
        this.billNo = billNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
