package com.example.freitagaufgabe_spring.controller;

import com.example.freitagaufgabe_spring.model.Order;
import com.example.freitagaufgabe_spring.model.Product;
import com.example.freitagaufgabe_spring.service.OrderService;
import com.example.freitagaufgabe_spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderController {

    private final OrderService orderService;


    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getOrders(){
        return this.orderService.getOrders();

    }

    @PostMapping
    public Order createOrder(){
        return this.orderService.createOrder();
    }

    @PutMapping("/{orderId}")
    public Order addProducts(@PathVariable String orderId, @RequestBody String productName){

        try {
            return this.orderService.addProduct(orderId, productName);
        } catch (IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


}

