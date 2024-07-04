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

@Entity
@Table(name="product")
public class Product {

	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Long productId;
		  
	  @Column(name = "product_name")
	  private String productName;
	  
	  @ManyToOne(fetch = FetchType.EAGER)	
	  @JoinColumn(name = "customer_id") 
	  Customer customer;

	  protected Product() {}


	  @Override
	  public String toString() {
	    return String.format(
	        "Product[productId=%d, productName='%s'']",
	        productId, productName);
	  }


	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	
}