package com.mkyong.onetomany1;

import javax.persistence.*;
import java.util.List;

/**
 * 据说JPA规范中，关系由多端维护
 */

@Entity
@Table(name = "ONETOMANY1_BILL_INPUT")
public class OneToMany1BillEntity {


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

//    @OneToMany(mappedBy = "billEntity",cascade = CascadeType.ALL)
//    List<OneToMany1BillDetailEntity> billDetailEntityList;

//    mappedBy = "billEntity",
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order_has_product",
            joinColumns = {@JoinColumn(name = "bill_no", referencedColumnName = "no")},
            inverseJoinColumns = {@JoinColumn(name = "bill_detail_no", referencedColumnName = "no")}
    )
    List<OneToMany1BillDetailEntity> billDetailEntityList;


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

    public List<OneToMany1BillDetailEntity> getBillDetailEntityList() {
        return billDetailEntityList;
    }

    public void setBillDetailEntityList(List<OneToMany1BillDetailEntity> billDetailEntityList) {
        this.billDetailEntityList = billDetailEntityList;
    }
}
