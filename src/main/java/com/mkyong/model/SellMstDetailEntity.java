package com.mkyong.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SELL_MST_DETAIL")
public class SellMstDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="NO")
    private Integer no;

    /**
     * 存在しない場合があります
     * 例えば、ウェブサイトからの顧客注文の場合、NOしかない
     */
    @Column(name="SELL_NO")
    private Integer sellNo;

    @Column(name="PRICE")
    private Integer price;

    @Column(name="DISCOUNT_RATE")
    private Double discountRate;

    @Column(name="BILL_NO")
    private String billNO;

    @Column(name="BILL_DETAIL_NO")
    private String billDetailNo;

    @Column(name="NUM")
    private Integer num;

    @Column(name="STATUS")
    private String status;

    @Column(name="REMARKS")
    private String remarks;

    @Column(name="CHECK_SEND_DATE")
    private Date checkSendDate;

    @Column(name="CONFIRM_DATE")
    private Date confirmDate;


    @Column(name="CREATE_DATE")
    private Date createDate;


    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getSellNo() {
        return sellNo;
    }

    public void setSellNo(Integer sellNo) {
        this.sellNo = sellNo;
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

    public String getBillNO() {
        return billNO;
    }

    public void setBillNO(String billNO) {
        this.billNO = billNO;
    }

    public String getBillDetailNo() {
        return billDetailNo;
    }

    public void setBillDetailNo(String billDetailNo) {
        this.billDetailNo = billDetailNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCheckSendDate() {
        return checkSendDate;
    }

    public void setCheckSendDate(Date checkSendDate) {
        this.checkSendDate = checkSendDate;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
