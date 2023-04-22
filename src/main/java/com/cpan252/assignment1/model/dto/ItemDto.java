package com.cpan252.assignment1.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {

    private Long id;
    private String name;
    private Brand brand;
    private int created;
    private double price;
    private Long distributionCentreId;

    public enum Brand {

        DIOR("Dior"), STONE_ISLAND("Stone Island"), PALMANGELS("Palm Angels"), BALENCIAGA ("Balenciaga"), CHANEL("Chanel");
        private String name;
        private Brand(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

}
 