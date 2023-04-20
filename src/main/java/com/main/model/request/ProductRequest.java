package com.main.model.request;

import com.main.model.entity.Category;
import com.main.model.entity.ProductCart;
import com.main.model.entity.Rate;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
public class ProductRequest {
    @NotNull(message = "Product_Id must not be null")
    private Long id;

    @NotNull(message = "Product_Code must not be null")
    @Size(max = 50, message = "Product_Code's length should be less than 50 characters")
    private String productCode;

    @NotNull(message = "Product_Name must not be null")
    @Size(max = 255, message = "Product_Name's length should be less than 255 characters")
    private String productName;

    @NotNull(message = "Product_Image must not be null")
    @Size(max = 2055, message = "Product_Image's length should be less than 2055 characters")
    private String image;

    @NotNull(message = "Price must not be null")
    private double price;

    @NotNull(message = "Product_Size must not be null")
    private int size;

    @NotNull(message = "Product_Description must not be null")
    @Size(max = 2055, message = "Product_Description's length should be less than 2055 characters")
    private String description;

    @NotNull(message = "Product_Additional must not be null")
    @Size(max = 2055, message = "Product_Additional's length should be less than 2055 characters")
    private String additional;

    private LocalTime dateFrom;

    private LocalTime dateTo;

    @NotNull(message = "Is_Check_Broken should not be null")
    private boolean isBroken = false;

    @NotNull(message = "Is_Enabled should not be null")
    private boolean isEnabled = true;

    @NotNull(message = "Is_Deleted should not be null")
    private boolean isDeleted = false;

    private Category category;

    private List<Rate> rates;

    private List<ProductCart> productCarts;
}
