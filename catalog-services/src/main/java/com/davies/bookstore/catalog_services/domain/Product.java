package com.davies.bookstore.catalog_services.domain;

import java.math.BigDecimal;

public record Product(
    String code, String name, String Description, String imageUrl, BigDecimal price) {}
