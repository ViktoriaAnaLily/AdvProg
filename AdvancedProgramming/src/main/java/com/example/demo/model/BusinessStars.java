package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "businessstars")
public class BusinessStars {
	@Id
	private String stars;

	private int amount;

	public BusinessStars() {
		super();
	}

	public BusinessStars(String stars, int amount) {
		super();
		this.stars = stars;
		this.amount = amount;
	}

	@Id
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
