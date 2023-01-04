package com.example.oszczedzaMy.shop;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

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
}
