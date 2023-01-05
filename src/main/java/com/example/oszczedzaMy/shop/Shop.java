package com.example.oszczedzaMy.shop;

import com.example.oszczedzaMy.product.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple class to represent a shop with basic data
 * also ready to showing it as db record.
 *
 * */
@Entity
@Component
@Table(name = "shops")
@Getter
@ToString
@NoArgsConstructor
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_Id", nullable = true)
    private Long id;

    @Column(name = "shop_name")
    private String shopName;

    @OneToMany
    @JoinColumn(name = "shop_inventory")
    private List<Product> shopInventory = new ArrayList<>();
}
