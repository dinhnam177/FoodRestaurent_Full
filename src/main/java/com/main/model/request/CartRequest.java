package com.main.model.request;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.main.model.entity.Bill;
import com.main.model.entity.ProductCart;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CartRequest {
    @NotNull(message = "Product_Id must not be null")
    private Long id;

    @NotNull(message = "Subtotal must not be null")
    private double subtotal;

    @NotNull(message = "Discount must not be null")
    private int discount;

    @NotNull(message = "Total_Price must not be null")
    private double totalPrice;

    private List<ProductCart> productCarts;

    private Bill bill;
}
