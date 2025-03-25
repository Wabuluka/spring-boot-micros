package com.davies.bookstore.catalog_services.web.exception;

import com.davies.bookstore.catalog_services.domain.ProductNotFoundException;
import java.net.URI;
import java.time.Instant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  private static final URI NOT_FOUND_TYPE =
      URI.create("https://api.bookstore.com/errors/not-found");
  private static final URI ISE_FOUND_TYPE =
      URI.create("https://api.bookstore.com/errors/server-error");
  private static final String SERVICE_NAME = "catalog-service";

  @ExceptionHandler({Exception.class})
  ProblemDetail handleUnhandledException(Exception ex) {
    ProblemDetail problemDetail =
        ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    problemDetail.setTitle("Internal Server Error");
    problemDetail.setType(ISE_FOUND_TYPE);
    problemDetail.setProperty("service", SERVICE_NAME);
    problemDetail.setProperty("error_category", "Generic");
    problemDetail.setProperty("timestamp", Instant.now());
    return problemDetail;
  }

  ProblemDetail handleProductNotFoundException(ProductNotFoundException e) {
    ProblemDetail problemDetail =
        ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
    problemDetail.setTitle("Product not found");
    problemDetail.setType(NOT_FOUND_TYPE);
    problemDetail.setProperty("service", SERVICE_NAME);
    problemDetail.setProperty("error_category", "Generic");
    problemDetail.setProperty("timestamp", Instant.now());
    return problemDetail;
  }
}
