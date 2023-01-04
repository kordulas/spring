package com.example.oszczedzaMy.cart;

import com.example.oszczedzaMy.customer.Customer;
import com.example.oszczedzaMy.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
/**
 * Simple class to represent a customer cart with product/products
 * also ready to showing it as db record.
 * */
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
    @JoinColumn(name = "cart_contest")
    private List<Product> productList = new ArrayList<>();


    public void addProduct(Product product){
        productList.add(product);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", productList=" + productList.toString() +
                '}';
    }
}
