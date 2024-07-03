package com.sunbeam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(name="products")
public class Products extends BaseEntity{

	@Column(name = "name",length = 50,unique = true)
	private String productName;
	
	private double price;
	
	@Column( name = "available_quantity",length = 25)
	private int availableQuantity;
	
	//@ManyToOne
	
	//@JoinColumn(name = "category_id", nullable = false) 
	
	
	//private Category category;

	
	
	public Products(String productName, double price, int availableQuantity) {
		super();
		this.productName = productName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		
	}

	

//	public Category getCategory() {
//		return category;
//	}
//
//	public void setCategory(Category category) {
//		this.category = category;
//	}

	
	
	

	
	
	

}
