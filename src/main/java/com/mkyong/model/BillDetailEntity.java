package com.mkyong.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BILL_INPUT_DETAIL")
public class BillDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="NO")
    private Integer no;


//    @Column(name="BILL_NO")
    @Transient
    private Integer billNo;

    @Column(name="RESP_NUM")
    private Integer respNum;

    @Column(name="PRICE")
    private Integer price;

    @Column(name="RESP_DATE")
    private Date respDate;

    @Column(name="DISCOUNT_RATE")
    private Double discountRate;

    @ManyToOne
    @JoinColumn(name = "BILL_NO")
    private BillEntity billEntity;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getBillNo() {
        return billNo;
    }

    public void setBillNo(Integer billNo) {
        this.billNo = billNo;
    }

    public Integer getRespNum() {
        return respNum;
    }

    public void setRespNum(Integer respNum) {
        this.respNum = respNum;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public Date getRespDate() {
        return respDate;
    }

    public void setRespDate(Date respDate) {
        this.respDate = respDate;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public BillEntity getBillEntity() {
        return billEntity;
    }

    public void setBillEntity(BillEntity billEntity) {
        this.billEntity = billEntity;
    }
}
