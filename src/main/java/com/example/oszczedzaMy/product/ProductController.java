package com.example.oszczedzaMy.product;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@Slf4j
@Transactional
public class ProductController {

    private final ProductServiceImplementation productServiceImplementation;

    public ProductController(ProductServiceImplementation productServiceImplementation) {
        this.productServiceImplementation = productServiceImplementation;
    }
}
