package com.main.model.request;

import com.main.model.entity.Cart;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillRequest {
    @NotNull(message = "Bill_Id must not be null")
    private Long id;

    @NotNull(message = "FirstName must not be null")
    @Size(max = 50, message = "FirstName's length should be less than 255 characters")
    private String firstName;

    @NotNull(message = "LastName must not be null")
    @Size(max = 50, message = "LastName's length should be less than 50 characters")
    private String lastName;

    @NotNull(message = "Address must not be null")
    @Size(max = 2055, message = "Address's length should be less than 2055 characters")
    private String address;

    @NotNull(message = "Country must not be null")
    @Size(max = 255, message = "Country's length should be less than 255 characters")
    private String country;

    @NotNull(message = "PayType should not be null")
    private String payType;

    @NotNull(message = "Status must not be null")
    @Size(max = 255, message = "Status's length should be less than 255 characters")
    private String status;

    private Cart cart;
}
