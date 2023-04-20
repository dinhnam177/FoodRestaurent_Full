package com.main.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Product_Id must not be null")
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "Product_Code must not be null")
    @Size(max = 50, message = "Product_Code's length should be less than 50 characters")
    @Column(name = "product_code")
    private String productCode;

    @NotNull(message = "Product_Name must not be null")
    @Size(max = 255, message = "Product_Name's length should be less than 255 characters")
    @Column(name = "product_name")
    private String productName;

    @NotNull(message = "Product_Image must not be null")
    @Size(max = 2055, message = "Product_Image's length should be less than 2055 characters")
    private String image;

    @NotNull(message = "Price must not be null")
    private double price;

    @NotNull(message = "Product_Size must not be null")
    private int size;

    @NotNull(message = "Product_Description must not be null")
    @Size(max = 2055, message = "Product_Description's length should be less than 2055 characters")
    private String description;

    @NotNull(message = "Product_Additional must not be null")
    @Size(max = 2055, message = "Product_Additional's length should be less than 2055 characters")
    private String additional;

    @Column(name = "date_from")
    private LocalTime dateFrom;

    @Column(name = "date_to")
    private LocalTime dateTo;

    @NotNull(message = "Is_Check_Broken should not be null")
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isBroken = false;

    @NotNull(message = "Is_Enabled should not be null")
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isEnabled = true;// dùng để bật lên nếu bánh có thể được sử dụng còn tắt đi là bánh không được sử dụng
    // kiểu bật lên là sẽ hiện lên danh sách bán còn tắt đi là kiểu bánh có thể đang bảo trì sửa chữa hoặc có thể là hết.

    @NotNull(message = "Is_Deleted should not be null")
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isDeleted = false;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL)
    private List<Rate> rates;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductCart> productCarts;
}
