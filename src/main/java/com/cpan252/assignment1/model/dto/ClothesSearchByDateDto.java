package com.cpan252.assignment1.model.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.cpan252.assignment1.model.Clothes.Brands;
@Data
@NoArgsConstructor
public class ClothesSearchByDateDto {
    private int created;
    private Brands brand;
    private String startDate;
    private String endDate;
}
