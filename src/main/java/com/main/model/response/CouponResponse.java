package com.main.model.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Setter
@Getter
public class CouponResponse {
    private Long id;

    private String couponCode;

    private String couponName;

    private String type;

    private int discount;

    private int percent;

    private String status;

    private LocalTime dateFrom;

    private LocalTime dateTo;

    private LocalTime registDate;
}
