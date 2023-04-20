package com.main.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "rate")
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Rate_Id must not be null")
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "Username must not be null")
    @Size(max = 255, message = "Username's length should be less than 255 characters")
    @Column(name = "username")
    private String username;

    @NotNull(message = "Email must not be null")
    @Size(max = 255, message = "Email's length should be less than 255 characters")
    @Column(name = "email")
    private String email;

    @NotNull(message = "Comment must not be null")
    @Size(max = 2055, message = "Comment's length should be less than 2055 characters")
    private String comment;

    @Size(max = 2055, message = "Product_Image's length should be less than 2055 characters")
    private String image;

    @NotNull(message = "permission should not be null")
    private String permission;

    @Column(name = "date_comment")
    private LocalTime date;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

}
