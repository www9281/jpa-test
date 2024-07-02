package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class __ProductApplication {

  private static final Logger log = LoggerFactory.getLogger(__ProductApplication.class);
	
	 public static void main(String[] args) {
	  SpringApplication.run(__ProductApplication.class); }
	
  /*
  public CommandLineRunner demoProduct(ProductRepository repository) {
    return (args) -> {
      // save a few products
      repository.save(new Product(1l, 1l, "컴퓨터"));
      repository.save(new Product(2l, 1l, "TV"));
      repository.save(new Product(3l, 1l, "냉장고"));
      repository.save(new Product(4l, 1l, "세탁기"));
      repository.save(new Product(5l, 1l, "건조기"));
      repository.save(new Product(1l, 2l, "건조기"));
      
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
  */

}