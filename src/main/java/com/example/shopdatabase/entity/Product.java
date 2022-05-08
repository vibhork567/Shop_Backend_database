package com.example.shopdatabase.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    @Column(nullable = false)
    private String product_name;


    private String Supplier_name ;
    private int Supplier_ID;
    private int Quantity_Received;
    private int Product_Price_per_unit;
    private int Quantity_Left;
    private int GST;
    private int Total_Price;

    @ManyToOne
    private Supplier supp;
    @ManyToOne
    private Customer cust;
    @OneToOne
    private CreditDebit credeb;

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getSupplier_name() {
        return Supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        Supplier_name = supplier_name;
    }

    public CreditDebit getCredeb() {
        return credeb;
    }

    public void setCredeb(CreditDebit credeb) {
        this.credeb = credeb;
    }

    public int getGST() {
        return GST;
    }

    public void setGST(int GST) {
        this.GST = GST;
    }

    public int getQuantity_Received() {
        return Quantity_Received;
    }

    public void setQuantity_Received(int quantity_Received) {
        Quantity_Received = quantity_Received;
    }
}