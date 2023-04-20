package com.main.model.request;

import com.main.model.entity.Product;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Setter
@Getter
public class RateRequest {
    @NotNull(message = "Rate_Id must not be null")
    private Long id;

    @NotNull(message = "Username must not be null")
    @Size(max = 255, message = "Username's length should be less than 255 characters")
    private String username;

    @NotNull(message = "Email must not be null")
    @Size(max = 255, message = "Email's length should be less than 255 characters")
    private String email;

    @NotNull(message = "Comment must not be null")
    @Size(max = 2055, message = "Comment's length should be less than 2055 characters")
    private String comment;

    @Size(max = 2055, message = "Product_Image's length should be less than 2055 characters")
    private String image;

    @NotNull(message = "permission should not be null")
    private String permission;

    private LocalTime date;

    private Product product;
}
