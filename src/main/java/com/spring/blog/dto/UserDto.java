package com.spring.blog.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private int id;
    @NotEmpty
    @Size(min = 4, message = "!! Minimum 4 characters should in name  !!")
    private String name;

    @Email(message = "!! Email Format is not valid !!")
    private String email;
    @NotEmpty
    @Size(min = 6, message = "!! Password length should be more than 6 !!")
    private String password;
    @NotEmpty
    private String about;
}
