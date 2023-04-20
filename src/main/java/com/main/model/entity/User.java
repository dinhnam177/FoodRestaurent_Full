package com.main.model.entity;

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
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "User_Id must not be null")
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "Username must not be null")
    @Size(max = 255, message = "Username's length should be less than 255 characters")
    @Column(name = "username")
    private String username;

    @NotNull(message = "Password must not be null")
    @Size(max = 50, message = "Password's length should be less than 50 characters")
    @Column(name = "password")
    private String password;

    @NotNull(message = "role should not be null")
    private String role;
}
