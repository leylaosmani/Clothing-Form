package com.cpan252.assignment1.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistributionCentreDto {
    private int id;

    private String name;

    private String latitude;

    private String longitude;

}
