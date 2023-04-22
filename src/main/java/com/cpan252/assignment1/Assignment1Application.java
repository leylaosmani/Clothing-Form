package com.cpan252.assignment1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.cpan252.assignment1.model.Clothes;
import com.cpan252.assignment1.model.Clothes.Brands;
import com.cpan252.assignment1.repository.ClothesRepository;

// import java.math.BigDecimal;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}
	@Bean
	public CommandLineRunner dataLoader(ClothesRepository repository){
		return args -> {
			repository.save(Clothes.builder()
			.name("T-Shirt")
			.created(2023)
			.price(2000)
			.brand(Brands.PALMANGELS).build());

			repository.save(Clothes.builder()
			.name("Hoodie")
                .created(2021)
                .price(4000)
                .brand(Brands.STONE_ISLAND)
                .build());

				repository.save(Clothes.builder()
				.name("Jacket")
                .created(2022)
                .price(6000)
                .brand(Brands.BALENCIAGA)
                .build());

				repository.save(Clothes.builder()
				.name("Skirt")
                .created(2022)
                .price(8000)
                .brand(Brands.CHANEL)
                .build());

				repository.save(Clothes.builder()
				.name("Blouse")
                .created(2023)
                .price(3000)
                .brand(Brands.DIOR)
                .build());
		};
	
	}
}
