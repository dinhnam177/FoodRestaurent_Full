package com.main.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Bill_Id must not be null")
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "FirstName must not be null")
    @Size(max = 50, message = "FirstName's length should be less than 255 characters")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "LastName must not be null")
    @Size(max = 50, message = "LastName's length should be less than 50 characters")
    @Column(name = "last_name")
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

    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    private Cart cart;
}
