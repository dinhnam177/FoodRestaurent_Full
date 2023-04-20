package com.main.model.request;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.main.model.entity.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryRequest {
    @NotNull(message = "Category_Id must not be null")
    private Long id;

    @NotNull(message = "Category_Name must not be null")
    @Size(max = 255, message = "Category_Name's length should be less than 255 characters")
    private String categoryName;

    @NotNull(message = "Category_Image must not be null")
    @Size(max = 2055, message = "Category_Image's length should be less than 2055 characters")
    private String image;

    @NotNull(message = "Category_Quantity must not be null")
    private int quantity;

    private List<Product> products;
}
