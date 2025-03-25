package com.davies.bookstore.catalog_services.domain;

public class ProductNotFoundException extends RuntimeException {
  public ProductNotFoundException(String message) {
    super(message);
  }

  public static ProductNotFoundException forCode(String code) {
    return new ProductNotFoundException("Product with code " + code + " not found");
  }
}
