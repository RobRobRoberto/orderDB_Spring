package com.example.freitagaufgabe_spring.repository;


import com.example.freitagaufgabe_spring.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private List<Order> orders;


    public OrderRepository() {
        orders = new ArrayList<>(List.of(
                new Order(),
                new Order(),
                new Order()
        ));

    }


    public List<Order> findAll() {


        return orders;
    }

    public Order create() {
    Order order = new Order();
         orders.add(order);
         return order;
    }
}
