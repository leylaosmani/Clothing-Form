package com.cpan252.assignment1.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;

@Data 
@Builder
public class Clothes {
    @NotBlank
    private int id;
    private String name;
    @Min(2021)
    private int created;
    @Min(1000)
    private int price;
    private Brands brand;
    public enum Brands {
        DIOR("Dior"), STONE_ISLAND("Stone Island"), PALMANGELS("Palm Angels"), BALENCIAGA ("Balenciaga"), CHANEL("Chanel");

        private String title;
        Brands(String title){
            this.title = title;
        }
        public String getTitle(){
            return title;
        }
    }
}



