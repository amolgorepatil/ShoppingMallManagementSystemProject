package com.main.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_entity")
public class EmployeeEntity {
	private Integer id;
	private String name;
	private Date dob;
	private String address;
	private String designation;
	ShopEntity shop_id;
	
	
	public EmployeeEntity(Integer id, String name, Date dob, String address, String designation) {
		
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.designation = designation;
	}

	public EmployeeEntity() {}
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address
				+ ", designation=" + designation + "]";
	}
	
	

}
