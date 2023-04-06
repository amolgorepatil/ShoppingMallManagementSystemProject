package com.main.entity;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sowner_entity")
public class SownerEntity {
	
	private Integer id;
	private String name;
	private Date dob;
	private String address;
	ShopEntity shop_id;
	
	public SownerEntity(Integer id, String name, Date dob, String address) 
	{
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	public SownerEntity(){}	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ShopOwner [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + "]";
	}


}
