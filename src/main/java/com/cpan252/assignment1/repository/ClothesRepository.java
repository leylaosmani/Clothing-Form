package com.cpan252.assignment1.repository;
import com.cpan252.assignment1.model.Clothes;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cpan252.assignment1.model.Clothes.Brands;;;

public interface ClothesRepository extends JpaRepository<Clothes, Long> {
    List<Clothes> findByBrandAndCreated(Brands brand, int created);
    List<Clothes> findByBrand(Brands brand);
    List<Clothes> findAll();
    
}

