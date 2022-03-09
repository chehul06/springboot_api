package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class orders {
	
	@Id
	private long order_id;
	private String customer;
	private String country;
	private String address;
	private String product_title;
	private String product_description;
	private String date;
	@Override
	public String toString() {
		return "order [order_id=" + order_id + ", customer=" + customer + ", country=" + country + ", address="
				+ address + ", product_title=" + product_title + ", product_description=" + product_description
				+ ", date=" + date + ", status=" + status + "]";
	}
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProduct_title() {
		return product_title;
	}
	public void setProduct_title(String product_title) {
		this.product_title = product_title;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public orders(long order_id, String customer, String country, String address, String product_title,
			String product_description, String date, String status) {
		super();
		this.order_id = order_id;
		this.customer = customer;
		this.country = country;
		this.address = address;
		this.product_title = product_title;
		this.product_description = product_description;
		this.date = date;
		this.status = status;
	}
	private String status;
	
	
	

}
