package com.example.freitagaufgabe_spring.repository;

import com.example.freitagaufgabe_spring.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Repository
public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>(List.of(
                new Product("Bier"),
                new Product("Schnaps"),
                new Product("Wein"),
                new Product("MateTee")

        ));
    }

    public List<Product> findAll(){
        return products;
    }

    public Optional<Product> getProductByName(String productName){
        for(Product product:products){
            if(product.getProductName().equalsIgnoreCase(productName)){
                return Optional.of(product);
            }

        }
        return Optional.empty();


    }

}
