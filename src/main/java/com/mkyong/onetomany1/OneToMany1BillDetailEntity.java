package com.mkyong.onetomany1;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ONETOMANY1_BILL_INPUT_DETAIL")
public class OneToMany1BillDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="NO")
    private Integer no;


    @Column(name="RESP_NUM")
    private Integer respNum;

    @Column(name="PRICE")
    private Integer price;

    @Column(name="RESP_DATE")
    private Date respDate;

    @Column(name="DISCOUNT_RATE")
    private Double discountRate;

//    @ManyToOne(fetch = FetchType.LAZY)

    /**
     * 用中间表时不能使用ManyToOne，否则也会在这一端生成关联主表的字段
     */
    @OneToOne
    @JoinTable(name = "order_has_product",
            joinColumns = {@JoinColumn(name = "bill_detail_no", referencedColumnName = "no")},
            inverseJoinColumns = {@JoinColumn(name = "bill_no", referencedColumnName = "no")}
    )
    private OneToMany1BillEntity billEntity;

//    @Column(name="BILL_NO")
//    @Transient
//    private Integer billNo;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

//    public Integer getBillNo() {
//        return billNo;
//    }
//
//    public void setBillNo(Integer billNo) {
//        this.billNo = billNo;
//    }

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

    public OneToMany1BillEntity getBillEntity() {
        return billEntity;
    }

    public void setBillEntity(OneToMany1BillEntity billEntity) {
        this.billEntity = billEntity;
    }


}
