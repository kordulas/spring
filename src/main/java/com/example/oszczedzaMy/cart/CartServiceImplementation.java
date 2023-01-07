package com.example.oszczedzaMy.cart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CartServiceImplementation {

    private CartRepository cartRepository;

    public CartServiceImplementation(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
}
