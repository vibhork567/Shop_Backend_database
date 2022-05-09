package com.example.shopdatabase.entity;

import javax.persistence.*;

@Entity
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId;
    @Column(nullable = false)
    private String customer_name;



    private int customerID;
    private int cust_shopid;
    private int Quantity;
    private int PId;
    private int SPperUnitwithoutGST;
    private int GSTapplied;
    private int TotalPrice;
    private int SPAfterGST;
    @OneToOne
    private CreditDebit credeb;

    @ManyToOne
    @JoinColumn(name = "customer_customer_id")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //@ManyToOne
    //private Customer cust;

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

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCust_shopid() {
        return cust_shopid;
    }

    public void setCust_shopid(int cust_shopid) {
        this.cust_shopid = cust_shopid;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getPId() {
        return PId;
    }

    public void setPId(int PId) {
        this.PId = PId;
    }

    public int getSPperUnitwithoutGST() {
        return SPperUnitwithoutGST;
    }

    public void setSPperUnitwithoutGST(int SPperUnitwithoutGST) {
        this.SPperUnitwithoutGST = SPperUnitwithoutGST;
    }

    public int getGSTapplied() {
        return GSTapplied;
    }

    public void setGSTapplied(int GSTapplied) {
        this.GSTapplied = GSTapplied;
    }

    public int getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }

    public int getSPAfterGST() {
        return SPAfterGST;
    }

    public void setSPAfterGST(int SPAfterGST) {
        this.SPAfterGST = SPAfterGST;
    }

    public CreditDebit getCredeb() {
        return credeb;
    }

    public void setCredeb(CreditDebit credeb) {
        this.credeb = credeb;
    }

    /*public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }*/
}