package com.main.model.response;

import com.main.model.entity.Bill;
import com.main.model.entity.ProductCart;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CartResponse {
    private Long id;

    private double subtotal;

    private int discount;

    private double totalPrice;

    private List<ProductCart> productCarts;

    private Bill bill;
}
