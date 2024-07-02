package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class ProductApplication {

  private static final Logger log = LoggerFactory.getLogger(ProductApplication.class);
	
	 public static void main(String[] args) {
	  SpringApplication.run(ProductApplication.class); }
	
	  @Bean
	  @Transactional
  public CommandLineRunner demoProduct(ProductRepository repository) {
    return (args) -> {
      
      // fetch all products
      log.info("Products found with findAll():");
      log.info("-------------------------------");
      repository.findAll().forEach(product -> {
        log.info(product.toString());
      });
      log.info("");

      // fetch an individual product by ID
     // Product product = repository.findById(1L);
      log.info("Product found with findById(1L):");
      log.info("--------------------------------");
     // log.info(product.toString());
      log.info("");

      // fetch products by last name
      log.info("Product found with findByProductName('컴퓨터'):");
      log.info("--------------------------------------------");
      repository.findByProductName("컴퓨터").forEach(bauer -> {
        log.info(bauer.toString());
      });
      log.info("");
    };
  }
  

}