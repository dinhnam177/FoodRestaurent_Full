package com.main.model.response;

import com.main.model.entity.Product;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
@Setter
@Getter
public class RateResponse {
    private Long id;

    private String username;

    private String email;

    private String comment;

    private String image;

    private String permission;

    private LocalTime date;

    private Product product;
}
