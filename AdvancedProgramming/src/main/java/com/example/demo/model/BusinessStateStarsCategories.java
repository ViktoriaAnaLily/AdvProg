package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statestarscategories")
public class BusinessStateStarsCategories {
	@Id
	private int id;

	private String businessname;
	private String address;
	private String state;
	private String stars;
	private int amount;

	public BusinessStateStarsCategories() {
		super();
	}

	public BusinessStateStarsCategories(int id, String businessname, String address, String state, String stars,
			int amount) {
		super();
		this.id = id;
		this.businessname = businessname;
		this.address = address;
		this.state = state;
		this.stars = stars;
		this.amount = amount;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "businessname", nullable = false)
	public String getBusinessname() {
		return businessname;
	}

	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}

	@Column(name = "address", nullable = false)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "state", nullable = false)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "stars", nullable = false)
	public String getStars() {
		return stars;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

	@Column(name = "amount", nullable = false)
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
