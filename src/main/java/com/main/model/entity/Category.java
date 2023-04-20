package com.main.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Category_Id must not be null")
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "Category_Name must not be null")
    @Size(max = 255, message = "Category_Name's length should be less than 255 characters")
    @Column(name = "categoty_name")
    private String categoryName;

    @NotNull(message = "Category_Image must not be null")
    @Size(max = 2055, message = "Category_Image's length should be less than 2055 characters")
    private String image;

    @NotNull(message = "Category_Quantity must not be null")
    private int quantity;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;

}
