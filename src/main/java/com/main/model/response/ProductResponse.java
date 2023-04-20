package com.main.model.response;

import com.main.model.entity.Category;
import com.main.model.entity.ProductCart;
import com.main.model.entity.Rate;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;
@Getter
@Setter
public class ProductResponse {
    private Long id;

    private String productCode;

    private String productName;

    private String image;

    private double price;

    private int size;

    private String description;

    private String additional;

    private LocalTime dateFrom;

    private LocalTime dateTo;

    private boolean isBroken = false;

    private boolean isEnabled = true;

    private boolean isDeleted = false;

    private Category category;

    private List<Rate> rates;

    private List<ProductCart> productCarts;
}
