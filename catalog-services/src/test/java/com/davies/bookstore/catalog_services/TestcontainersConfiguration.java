package com.davies.bookstore.catalog_services;

import org.springframework.boot.SpringApplication;

class TestcontainersConfiguration {

  public static void main(String[] args) {
    SpringApplication.from(CatalogServicesApplication::main).with(ContainersConfig.class).run(args);
  }
}
