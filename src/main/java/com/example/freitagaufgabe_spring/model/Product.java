package com.example.freitagaufgabe_spring.model;

import java.util.UUID;

public class Product {

    private final String productId;
    private String productName;

    public Product(){
        this.productId = UUID.randomUUID().toString();

    }

    public Product(String productName) {
        this.productName = productName;
        this.productId = UUID.randomUUID().toString();
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
