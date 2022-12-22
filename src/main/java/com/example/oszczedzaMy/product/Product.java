package com.example.oszczedzaMy.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.eclipse.jdt.annotation.Nullable;
import org.springframework.stereotype.Component;
import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import java.time.LocalDate;

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
    private BigDecimal priceBeforeDiscount;
    @Column(name = "discount_price_")
    private BigDecimal priceAfterDiscount;
    @Column(name = "added date")
    private LocalDate addedDate;
  /*  private BufferedImage productPhoto;
    private BufferedImage pricePhoto;*/

}
