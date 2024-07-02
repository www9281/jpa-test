package com;

import java.util.List;

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
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="customer_id")
	  private Long customerId;
	  
	  @Column(name="first_name")
	  private String firstName; 
	  
	  @Column(name="last_name")
	  private String lastName;
	  
	  //@OneToMany(targetEntity = Product.class)
	  //@OneToMany(mappedBy = "customer")
	  //@JoinColumn(name = "customer_id2")
	  private List<Product> product ;

	  protected Customer() {}

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

	  public Long getCustomerId() {
	    return customerId;
	  }

	  public String getFirstName() {
	    return firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	  
	  
	  
	  
	}