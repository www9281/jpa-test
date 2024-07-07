package com;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	  @Id
	 // @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long customerId;
	  
	  @Column(name="first_name")
	  private String firstName; 
	  
	  @Column(name="last_name")
	  private String lastName;
	  
	 // @OneToMany(mappedBy = "customer", targetEntity = Product.class)
	  //@OneToMany(cascade = CascadeType.PERSIST)
	  @OneToMany(cascade = CascadeType.ALL)
	  private List<Product> product = new ArrayList<>() ;

	  public Customer() {}
	  

	  public Customer(Long customerId) {
	    this.customerId = customerId;
	  }

	  public Customer(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%d, firstName='%s', lastName='%s']",
	        customerId, firstName, lastName);
	  }

	  
	  
	}