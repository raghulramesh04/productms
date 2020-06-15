package com.infosys.project1.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subscribedproduct")
public class SubcribedProduct {
	@Id
	@GeneratedValue
	@Column(name="subid",nullable = false)
	int subId;
	@Column(name="prodid",nullable = false)
	int prodId;
	@Column(name="buyerid",nullable = false)
	int buyerId;
	@Column(name="quantity",nullable = false)
	int quantity;
	
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
