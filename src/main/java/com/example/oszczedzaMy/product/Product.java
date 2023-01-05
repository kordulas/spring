package com.example.oszczedzaMy.product;

import com.example.oszczedzaMy.shop.Shop;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Simple class to represent a product with basic data
 * also ready to showing it as db record.
 *
 * */
@Entity
@Component
@Table(name = "product")
@Getter
@ToString
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_Id")
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @OneToMany()
    @JoinColumn(name = "product_shop")
    private List<Shop> productShops;

    @Column(name = "regular_price")
    private BigDecimal regularPrice;

    @Column(name = "discount_price")
    private BigDecimal priceAfterDiscount;

    @Column(name = "added date")
    private LocalDate addedDate;

    /**
     * Annotation which help represent image of product with discount price
     * as a part of record in DB.
     */
    @Lob
    @Column(name = "product_price_picture")
    private byte[] photoWithPrice;

}
