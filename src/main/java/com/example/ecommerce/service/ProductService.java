

package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {
        return Arrays.asList(
                new Product(1, "Laptop", 65000),
                new Product(2, "Mobile", 25000),
                new Product(3, "Headphones", 3000)
        );
    }
}
