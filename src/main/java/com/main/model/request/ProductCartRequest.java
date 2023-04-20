package com.main.model.request;

import com.main.model.entity.Cart;
import com.main.model.entity.Product;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductCartRequest {
    @NotNull(message = "Product_Cart_Id must not be null")
    private Long id;

    @NotNull(message = "Quantity must not be null")
    private int quantity;

    private Cart cart;

    private Product product;
}
