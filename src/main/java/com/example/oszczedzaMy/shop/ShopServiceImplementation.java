package com.example.oszczedzaMy.shop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShopServiceImplementation {

    private ShopRepository shopRepository;

    public ShopServiceImplementation(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }
}
