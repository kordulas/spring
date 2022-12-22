package com.example.oszczedzaMy.cart;

import com.example.oszczedzaMy.customer.Customer;
import com.example.oszczedzaMy.product.Product;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Component
@Table(name = "cart")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Cart_Id", nullable = true)
    private Long id;

    @OneToMany
    @Column(name = "products_in_cart")
    private List<Product> productList;

    @Override
    public String toString() {
        return "Cart{" +
                "productList=" + productList +
                '}';
    }
}
