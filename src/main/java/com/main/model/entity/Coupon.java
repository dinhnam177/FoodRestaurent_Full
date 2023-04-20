package com.main.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Coupon_Id must not be null")
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "Coupon_Code must not be null")
    @Size(max = 50, message = "Coupon_Code's length should be less than 50 characters")
    @Column(name = "coupon_Code")
    private String couponCode;

    @NotNull(message = "Coupon_Name must not be null")
    @Size(max = 255, message = "Coupon_Name's length should be less than 255 characters")
    @Column(name = "coupon_name")
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

    @Column(name = "date_from")
    private LocalTime dateFrom;

    @Column(name = "date_to")
    private LocalTime dateTo;

    @Column(name = "regist_date")
    private LocalTime registDate;

}
