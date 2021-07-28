package com.example.freitagaufgabe_spring.service;

import com.example.freitagaufgabe_spring.model.Order;
import com.example.freitagaufgabe_spring.model.Product;
import com.example.freitagaufgabe_spring.repository.OrderRepository;
import com.example.freitagaufgabe_spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }


    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Order createOrder() {
        return orderRepository.create();

    }

    public Order addProduct(String orderId, String productName) {
        Optional<Product> product = productRepository.getProductByName(productName);
        if(product.isPresent()) {
            return orderRepository.addProduct(orderId, product.get());
        }
        throw  new IllegalArgumentException("Product with String " + productName + " not found");
    }
}
