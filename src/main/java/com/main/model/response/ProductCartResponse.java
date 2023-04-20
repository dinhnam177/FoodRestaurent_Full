package com.main.model.response;

import com.main.model.entity.Cart;
import com.main.model.entity.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductCartResponse {
    private Long id;

    private int quantity;

    private Cart cart;

    private Product product;
}
