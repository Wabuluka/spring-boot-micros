package com.davies.bookstore.catalog_services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(ContainersConfig.class)
class CatalogServicesApplicationTests {

  @Test
  void contextLoads() {}
}
