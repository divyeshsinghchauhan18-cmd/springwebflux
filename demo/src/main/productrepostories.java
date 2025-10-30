package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class ProductRepository {

    public Flux<Product> getProducts() {
        return Flux.just(
                new Product(1, "Laptop", 50000, "Electronics"),
                new Product(2, "T-Shirt", 499, "Clothing"),
                new Product(3, "Earphones", 799, "Accessories")
        );
    }
}
