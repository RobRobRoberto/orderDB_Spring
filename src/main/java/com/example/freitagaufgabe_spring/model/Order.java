package com.example.freitagaufgabe_spring.model;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private final String id;
    private List<Product> products = new ArrayList<>();

    public Order(){
        this.id = UUID.randomUUID().toString();

    }

    public String getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        products.add((product));

    }
}
