package com.cpan252.assignment1.model;

import jakarta.validation.constraints.Min;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity 
public class Clothes {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Min(2021)
    @Column(name = "created")
    private int created;
    @Min(1000)
    @Column(name = "price")
    private int price;
    @Column(name = "brand")
    @Enumerated(EnumType.STRING)
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
      public Clothes(String name, int created, int price, Brands brand) {
        this.name = name;
        this.created = created;
        this.price = price;
        this.brand = brand;
    }
}



