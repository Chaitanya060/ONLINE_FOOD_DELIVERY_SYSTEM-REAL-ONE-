package com.jfsd.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_table")

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false,length = 1000)
	private String username;
	@Column(nullable = false,length = 1000,unique = true)
	private String password;
	@Column(nullable = false,length = 1000,unique = true)
	private String contact;
	@Column(nullable = false,length = 1000)
	private String address;
	@Column(nullable = false,length = 1000)
	private String orderhistory;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrderhistory() {
		return orderhistory;
	}
	public void setOrderhistory(String orderhistory) {
		this.orderhistory = orderhistory;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", password=" + password + ", contact=" + contact
				+ ", address=" + address + ", orderhistory=" + orderhistory + "]";
	}
	
	
	
	
	
	

}
