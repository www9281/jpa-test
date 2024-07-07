package com.example.demo.test;


import org.junit.Test;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.Customer;
import com.CustomerRepository;

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
	   

	 // @Bean
	  //@Transactional
	  @Test
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
