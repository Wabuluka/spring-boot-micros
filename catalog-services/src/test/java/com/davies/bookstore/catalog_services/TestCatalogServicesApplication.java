package com.davies.bookstore.catalog_services;

import org.springframework.boot.SpringApplication;

public class TestCatalogServicesApplication {

  public static void main(String[] args) {
    SpringApplication.from(CatalogServicesApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
