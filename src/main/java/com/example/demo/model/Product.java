package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	private long id;
	private String name;
	private int price;
	private String desc;
	
	public Product() {
		
	}
	
	public Product(String name, int price, String desc) {
//		super();
		this.name = name;
		this.price = price;
		this.desc = desc;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "Product [Id=" + id + ", name=" + name + ", price=" + price + ", desc=" + desc + "]";
	}
	
	

}
