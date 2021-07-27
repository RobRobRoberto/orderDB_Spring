package com.example.freitagaufgabe_spring.service;

import com.example.freitagaufgabe_spring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}
