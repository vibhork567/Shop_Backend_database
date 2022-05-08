package com.example.shopdatabase.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopId;


    private String Customer_name;
    private String ShopName;
    private int Bid;
    private String Pname;
    private int AmtPaid;
    private int AmtLeft;
    @OneToMany(mappedBy = "customer")
    private List<Billing> bill = new ArrayList<>();
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String customer_name) {
        Customer_name = customer_name;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public int getBid() {
        return Bid;
    }

    public void setBid(int bid) {
        Bid = bid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public int getAmtPaid() {
        return AmtPaid;
    }

    public void setAmtPaid(int amtPaid) {
        AmtPaid = amtPaid;
    }

    public int getAmtLeft() {
        return AmtLeft;
    }

    public void setAmtLeft(int amtLeft) {
        AmtLeft = amtLeft;
    }


    public List<Billing> getBill() {
        return bill;
    }

    public void setBill(List<Billing> bill) {
        this.bill = bill;
    }
}