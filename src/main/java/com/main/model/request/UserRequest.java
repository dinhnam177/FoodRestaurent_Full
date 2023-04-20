package com.main.model.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    @NotNull(message = "User_Id must not be null")
    private Long id;

    @NotNull(message = "Username must not be null")
    @Size(max = 255, message = "Username's length should be less than 255 characters")
    private String username;

    @NotNull(message = "Password must not be null")
    @Size(max = 50, message = "Password's length should be less than 50 characters")
    private String password;

    @NotNull(message = "role should not be null")
    private String role;
}
