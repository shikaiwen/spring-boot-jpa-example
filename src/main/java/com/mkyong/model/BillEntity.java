package com.mkyong.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BILL_INPUT")
public class BillEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="NO")
    private int no;

    @Column(name = "BILL_CUST_NO")
    private String billCustNo;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "BILL_NUM")
    private Integer billNum;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "DISCOUNT_RATE")
    private Double discountRate;

    @OneToMany(mappedBy = "billEntity",cascade = CascadeType.ALL)
//    @Transient
    List<BillDetailEntity> billDetailEntityList;


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBillCustNo() {
        return billCustNo;
    }

    public void setBillCustNo(String billCustNo) {
        this.billCustNo = billCustNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getBillNum() {
        return billNum;
    }

    public void setBillNum(Integer billNum) {
        this.billNum = billNum;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public List<BillDetailEntity> getBillDetailEntityList() {
        return billDetailEntityList;
    }

    public void setBillDetailEntityList(List<BillDetailEntity> billDetailEntityList) {
        this.billDetailEntityList = billDetailEntityList;
    }
}
