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

    private String productName;
    private BigDecimal priceBeforeDiscount;
    private BigDecimal priceAfterDiscount;
    private LocalDate addedDate;
    private BufferedImage productPhoto;
    private BufferedImage pricePhoto;

}
