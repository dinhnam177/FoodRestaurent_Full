package com.main.model.response;

import com.main.model.entity.Cart;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillResponse {
    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private String country;

    private String payType;

    private String status;

    private Cart cart;
}
