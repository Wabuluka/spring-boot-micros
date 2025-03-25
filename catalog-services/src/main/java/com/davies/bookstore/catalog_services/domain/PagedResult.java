package com.davies.bookstore.catalog_services.domain;

import java.util.List;

public record PagedResult<T>(
    List<T> data,
    long totalElements,
    int pageNumber,
    int totalPages,
    boolean isFirst,
    boolean isLast,
    boolean hasNext,
    boolean hasPrevious) {}
