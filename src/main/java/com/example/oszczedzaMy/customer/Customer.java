package com.example.oszczedzaMy.customer;

import com.example.oszczedzaMy.cart.Cart;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.eclipse.jdt.annotation.Nullable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity
@Component
@Table(name = "customer")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;
    private String name;
    private String lastName;
    private LocalDate accountCreateDate;
    @OneToOne
    @JoinColumn(name = "customer_cart_contest")
    private Cart customerCart;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountCreateDate=" + accountCreateDate +
                ", customerCart=" + customerCart +
                '}';
    }
}
