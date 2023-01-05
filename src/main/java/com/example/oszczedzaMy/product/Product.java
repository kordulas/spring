package com.example.oszczedzaMy.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

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

    @Column(name = "product_shop")
    private String productShop;

    @Column(name = "regular_price")
    private BigDecimal regularPrice;

    @Column(name = "discount_price")
    private BigDecimal priceAfterDiscount;

    @Column(name = "added date")
    private LocalDate addedDate;

    @Column(name = "shop_name ")
    private String shopName;

    /**
     * Annotation which help represent image of product with discount price
     * as a part of record in DB.
     */
    @Lob
    @Column(name = "product_price_picture")
    private byte[] photoWithPrice;

}
