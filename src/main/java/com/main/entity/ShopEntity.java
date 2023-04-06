package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shop_entity")
public class ShopEntity {
	private Integer shopId;
	private String shopCategory;
	private String shopName;
	private String customers;
	private String shopStatus;
	private String leaseStatus;
	SownerEntity shopOwner;
	EmployeeEntity shopEmployeeID;
	
	
	public ShopEntity(Integer shopId, String shopCategory, String shopName, String customers, String shopStatus,
			String leaseStatus) {
		super();
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopName = shopName;
		this.customers = customers;
		this.shopStatus = shopStatus;
		this.leaseStatus = leaseStatus;
	}
	public ShopEntity() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCustomers() {
		return customers;
	}
	public void setCustomers(String customers) {
		this.customers = customers;
	}
	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString() {
		return "ShopEntity [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopName=" + shopName
				+ ", customers=" + customers + ", shopStatus=" + shopStatus + ", leaseStatus=" + leaseStatus + "]";
	}
	

}
