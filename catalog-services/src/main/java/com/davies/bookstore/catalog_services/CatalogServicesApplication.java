package com.davies.bookstore.catalog_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CatalogServicesApplication {

  public static void main(String[] args) {
    SpringApplication.run(CatalogServicesApplication.class, args);
  }
}
