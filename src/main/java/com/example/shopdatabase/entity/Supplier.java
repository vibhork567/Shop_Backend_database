package com.example.shopdatabase.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int supplierId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopId;


    private String Supplier_name;
    private String ShopName;
    private int Pid;
    private String Pname;
    private int Amt_paid;
    private int Amt_left;
    @OneToMany(mappedBy = "supplier")
    private List<Product> prod = new ArrayList<>();

    public Supplier() {
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getSupplier_name() {
        return Supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        Supplier_name = supplier_name;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public int getAmt_paid() {
        return Amt_paid;
    }

    public void setAmt_paid(int amt_paid) {
        Amt_paid = amt_paid;
    }

    public int getAmt_left() {
        return Amt_left;
    }

    public void setAmt_left(int amt_left) {
        Amt_left = amt_left;
    }

    public List<Product> getProd() {
        return prod;
    }

    public void setProd(List<Product> prod) {
        this.prod = prod;
    }
}
