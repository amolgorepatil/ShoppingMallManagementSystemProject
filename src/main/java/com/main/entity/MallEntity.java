package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mall_entity")
public class MallEntity {
	private Long id;
	private String name;
	private String location;
	private String category;
	MallAdminEntity mallAdmin;
	ShopEntity shop_id;
	
	public MallEntity(Long id, String name, String location, String category) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.category = category;
	}

	public MallEntity() {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "MallEntity [id=" + id + ", name=" + name + ", location=" + location + ", category=" + category + "]";
	}
	
	

}
