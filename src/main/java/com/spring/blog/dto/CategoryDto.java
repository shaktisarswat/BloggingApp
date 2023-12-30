package com.spring.blog.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Integer categoryId;
    @NotEmpty
    @Size(min = 2, message = "!! Category size should be more than 2 !!")
    private String categoryTitle;
    @NotEmpty(message = "!! Category Description Should not be Empty !!")
    private String categoryDescription;
}
