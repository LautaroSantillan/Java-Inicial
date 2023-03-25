package com.deg.productservice.repository;

import com.deg.productservice.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {

    Optional<ProductModel> findByCodigo(String codigo);
}
