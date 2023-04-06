package com.main.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_entity")
public class ItemEntity {
	private  Long id;
	private String name;
	private Date manufacturing;
	private Date expiry;
	private Float price;
	private String category;
	
	
	public ItemEntity(Long id, String name, Date manufacturing, Date expiry, Float price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturing = manufacturing;
		this.expiry = expiry;
		this.price = price;
		this.category = category;
	}

	public ItemEntity() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getManufacturing() {
		return manufacturing;
	}

	public void setManufacturing(Date manufacturing) {
		this.manufacturing = manufacturing;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "ItemEntity [id=" + id + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry=" + expiry
				+ ", price=" + price + ", category=" + category + "]";
	}
	
}
