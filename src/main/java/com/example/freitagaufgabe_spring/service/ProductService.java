package com.example.freitagaufgabe_spring.service;

import com.example.freitagaufgabe_spring.model.Order;
import com.example.freitagaufgabe_spring.model.Product;
import com.example.freitagaufgabe_spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }


    public Product getProductByName(String productName) {
        Optional<Product> optProduct = productRepository.getProductByName(productName);
        if (optProduct.isPresent()){
            return optProduct.get();
         }
        throw new IllegalArgumentException("Product " + productName + " not found");
    }
}
