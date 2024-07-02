package com;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class ProductApplication {
/*
  private static final Logger log = LoggerFactory.getLogger(ProductApplication.class);
	
	 public static void main(String[] args) {
	  SpringApplication.run(ProductApplication.class); }
	
	  @Bean
	  @Transactional
  public CommandLineRunner demoProduct(ProductRepository repository) {
    return (args) -> {
      
  

      // fetch an individual product by ID
      Optional<Product> product = repository.findById(306l);
      log.info("Product found with findById(1L):");
      log.info("--------------------------------");
      log.info(product.toString());
   
      log.info("");

  
    };
 
  }
     */
}