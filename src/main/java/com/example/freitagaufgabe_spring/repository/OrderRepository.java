package com.example.freitagaufgabe_spring.repository;


import com.example.freitagaufgabe_spring.model.Order;
import com.example.freitagaufgabe_spring.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

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
    //evtl. eine Ebene vorher -> In ProductService impl.
    public Order addProduct(String orderId,String productName) {
        for(Order order:orders){
            if (order.getId().equals(orderId)){
                ProductRepository productRepository = new ProductRepository();
                System.out.println(productName);
               Product product = productRepository.getProductByName(productName);
               order.add(product);
               return order;
            }

        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

    }
}
