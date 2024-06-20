package com.jfsd.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaruent_table")
public class Restaruent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false,unique = true,length = 100)
	private String restaruent;
	@Column(nullable = false,length = 10000)
	private double item_cost;
	@Column(nullable = false,length = 1000)
	private String items;
	@Column(nullable = false,length = 1000)
	private String address;

	@Column(nullable = false,length = 1000,unique = true)
	private String contact;
	
	@Column(nullable = false,length = 1000,unique = true)
	
	private String password;
	@Column(nullable = false,length = 1000,unique = false)
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRestaruent() {
		return restaruent;
	}
	public void setRestaruent(String restaruent) {
		this.restaruent = restaruent;
	}
	public double getItem_cost() {
		return item_cost;
	}
	public void setItem_cost(double item_cost) {
		this.item_cost = item_cost;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Restaruent [id=" + id + ", restaruent=" + restaruent + ", item_cost=" + item_cost + ", items=" + items
				+ ", address=" + address + ", contact=" + contact + ", password=" + password + ", username=" + username
				+ "]";
	}
	
	
	
	

}
