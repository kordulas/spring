package com.example.oszczedzaMy.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.eclipse.jdt.annotation.Nullable;
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
    @Column(name = "Product_Id", nullable = true)
    private Long id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "regular_price")
    @Nullable
    private BigDecimal regularPrice;
    @Column(name = "price_with_discount_")
    private BigDecimal priceAfterDiscount;
    @Column(name = "added date")
    private LocalDate addedDate;
    @Column(name = "shop_name ")
    private String shopName;
  /*  private BufferedImage productPhoto;
    private BufferedImage pricePhoto;*/

}
