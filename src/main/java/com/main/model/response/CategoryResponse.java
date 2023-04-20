package com.main.model.response;

import com.main.model.entity.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class CategoryResponse {
    private Long id;

    private String categoryName;

    private String image;

    private int quantity;

    private List<Product> products;
}
