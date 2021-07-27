package com.example.freitagaufgabe_spring.controller;

import com.example.freitagaufgabe_spring.model.Order;
import com.example.freitagaufgabe_spring.model.Product;
import com.example.freitagaufgabe_spring.service.OrderService;
import com.example.freitagaufgabe_spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class OrderController {

    private final OrderService orderService;
    private final ProductService productService;

    @Autowired
    public OrderController(OrderService orderService, ProductService productService) {
        this.orderService = orderService;
        this.productService = productService;
    }



    @GetMapping("/order")
    public List<Order> getOrders(){
        return this.orderService.getOrders();

    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return this.productService.getProducts();
    }

    @PostMapping("/order")
    public Order createOrder(){
        return this.orderService.createOrder();
    }





}

