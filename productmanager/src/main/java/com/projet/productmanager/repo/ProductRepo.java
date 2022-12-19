package com.projet.productmanager.repo;

import com.projet.productmanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product, Long> {
    void deleteById(Long id);

    Optional<Product> findProductById(Long id);
}
