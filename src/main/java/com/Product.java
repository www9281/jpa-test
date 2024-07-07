package com;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="product")
@Getter
@Setter 

public class Product {

	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Long productId;
		  
	  @Column(name = "product_name")
	  private String productName;
	  
	  //@ManyToOne(fetch = FetchType.LAZY)	
	  //@JoinColumn(name = "customer_id") 
	  //Customer customer;

	  protected Product() {}


	  @Override
	  public String toString() {
	    return String.format(
	        "Product[productId=%d, productName='%s'']",
	        productId, productName);
	  }


}