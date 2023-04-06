package com.main.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "order_details_entity")
public class OrderDetailsEntity {
	private Integer id;
	private Date dateOfPurchase;
	private Float total;
	private String paymentMode;
	CustomerEntity customer_id ;
	ShopEntity shop_id ;
	
	public OrderDetailsEntity(Integer id, Date dateOfPurchase, Float total, String paymentMode) {
		super();
		this.id = id;
		this.dateOfPurchase = dateOfPurchase;
		this.total = total;
		this.paymentMode = paymentMode;
	}
	public OrderDetailsEntity() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "OrderDetailsEntity [id=" + id + ", dateOfPurchase=" + dateOfPurchase + ", total=" + total
				+ ", paymentMode=" + paymentMode + "]";
	}
	
	
	
	
}
