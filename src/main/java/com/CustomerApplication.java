package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@SpringBootApplication 
public class CustomerApplication {
/*
  private static final Logger log = LoggerFactory.getLogger(CustomerApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(CustomerApplication.class);
  }
 
  @Bean
  //@Transactional
  public CommandLineRunner demo(CustomerRepository repository) {
    return (args) -> {
  
    	 log.info("1111111111111");
     
      //Customer customer = repository.findById(2L);
    	 Customer customer = repository.findById(2l);
      log.info(customer.toString());
      log.info("");

    	 
    	 
    };
  }
*/
}