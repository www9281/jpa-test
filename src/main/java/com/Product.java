package com;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	  @Column(name = "product_id")
	  private Long productId;
	  
	  @Column(name = "customer_id2") 
	  private Long customerId2;	 
	  
	  @Column(name = "product_name")
	  private String productName;
	  
	  @ManyToOne
	  @JoinColumn(name = "customer_id") 
	  Customer customer;

	  protected Product() {}

	  public Product(Long productId, Long customerId2, String productName) {
	    this.productId = productId;
	    this.customerId2 = customerId2;
	    this.productName = productName;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Product[productId=%d, productName='%s'']",
	        productId, productName);
	  }


	public Long getProductId() {
		return productId;
	}

	public Long getCustomerId2() {
			return customerId2;
		}

	public String getProductName() {
		return productName;
	}
/*
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
*/
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public void setCustomerId2(Long customerId2) {
		this.customerId2 = customerId2;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}