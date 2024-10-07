package ie.atu.week3yr4;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Max;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Max(value = 9, message = "id cannot be greater than 8")
    private String id;


    @NotNull(message = "Name cannot be null")
    private String name;

    @Positive(message = "Price must be positive")
    private Double price;
}

