package com.davies.bookstore.catalog_services;

import org.springframework.boot.SpringApplication;
import org.testcontainers.utility.TestcontainersConfiguration;

public class TestCatalogServicesApplication {

  public static void main(String[] args) {
    SpringApplication.from(CatalogServicesApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
