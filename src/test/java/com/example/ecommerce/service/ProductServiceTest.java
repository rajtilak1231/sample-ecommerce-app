

package com.example.ecommerce.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductServiceTest {

    @Test
    void testGetProducts() {

        ProductService service = new ProductService();

        Assertions.assertEquals(3, service.getProducts().size());
    }
}
