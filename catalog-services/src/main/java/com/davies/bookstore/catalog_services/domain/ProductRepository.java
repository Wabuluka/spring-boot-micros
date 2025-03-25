package com.davies.bookstore.catalog_services.domain;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

interface ProductRepository extends JpaRepository<ProductEntity, Long> {
  Optional<ProductEntity> findByCode(String code);
}
