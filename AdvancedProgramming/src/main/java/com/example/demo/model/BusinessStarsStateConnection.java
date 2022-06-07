package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "starsstateconnection")
public class BusinessStarsStateConnection {

	
	private String state;

	private String stars;

	@Id
	private int amount;

	public BusinessStarsStateConnection(String state, String stars, int amount) {
		super();
		this.state = state;
		this.stars = stars;
		this.amount = amount;
	}

	public BusinessStarsStateConnection() {
		super();
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
