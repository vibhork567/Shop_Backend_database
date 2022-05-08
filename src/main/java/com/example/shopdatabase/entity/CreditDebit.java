package com.example.shopdatabase.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CreditDebit {
    @Id
    private int billId;
    @Column(nullable = false)
    private String customer_name;


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int creditDebit;
    private int creditdebitamount;
    private Date dateofcreditdebit;

    @OneToOne
    private Billing bill;
    @OneToOne
    private Product prod;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getCreditDebit() {
        return creditDebit;
    }

    public void setCreditDebit(int creditDebit) {
        this.creditDebit = creditDebit;
    }

    public int getCreditdebitamount() {
        return creditdebitamount;
    }

    public void setCreditdebitamount(int creditdebitamount) {
        this.creditdebitamount = creditdebitamount;
    }

    public Date getDateofcreditdebit() {
        return dateofcreditdebit;
    }

    public void setDateofcreditdebit(Date dateofcreditdebit) {
        this.dateofcreditdebit = dateofcreditdebit;
    }

    public Billing getBill() {
        return bill;
    }

    public void setBill(Billing bill) {
        this.bill = bill;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }


}