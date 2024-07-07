package com;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


@Getter
@Setter
@ToString
@Slf4j
@SpringBootApplication 
class JpaTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(JpaTestApplication.class);
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
	 
	
}
