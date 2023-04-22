package com.cpan252.assignment1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.cpan252.assignment1.model.Clothes;

@Repository
public interface ClothesRepositoryPaginated extends PagingAndSortingRepository<Clothes, Long> {
    
}
