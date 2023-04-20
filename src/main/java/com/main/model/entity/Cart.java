package com.main.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Product_Id must not be null")
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "Subtotal must not be null")
    @Column(name = "subtotal")
    private double subtotal;

    @NotNull(message = "Discount must not be null")
    @Column(name = "discount")
    private int discount;

    @NotNull(message = "Total_Price must not be null")
    private double totalPrice;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cart", cascade = CascadeType.ALL)
    private List<ProductCart> productCarts;

    @JsonBackReference
    @OneToOne(mappedBy = "cart")
    private Bill bill;

}
