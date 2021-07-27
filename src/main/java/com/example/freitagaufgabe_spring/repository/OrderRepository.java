package com.example.freitagaufgabe_spring.repository;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private List<Order> orders;


    public OrderRepository(List<Order> orders) {
        this.orders = orders;
    }


    public List<Order> findAll() {


        return null;
    }
}
