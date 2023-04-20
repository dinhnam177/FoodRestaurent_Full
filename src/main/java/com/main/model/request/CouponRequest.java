package com.main.model.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
public class CouponRequest {
    @NotNull(message = "Coupon_Id must not be null")
    private Long id;

    @NotNull(message = "Coupon_Code must not be null")
    @Size(max = 50, message = "Coupon_Code's length should be less than 50 characters")
    private String couponCode;

    @NotNull(message = "Coupon_Name must not be null")
    @Size(max = 255, message = "Coupon_Name's length should be less than 255 characters")
    private String couponName;

    @NotNull(message = "Coupon_Type should not be null")
    private String type;

    @NotNull(message = "Discount must not be null")
    private int discount;

    @NotNull(message = "Percent must not be null")
    private int percent;

    @NotNull(message = "Status must not be null")
    @Size(max = 2055, message = "Status's length should be less than 2055 characters")
    private String status;

    private LocalTime dateFrom;

    private LocalTime dateTo;

    private LocalTime registDate;
}
