package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "businessreview_count")
public class BusinessReview {

	@Id
	private String name;

	private int amount;

	public BusinessReview() {
		super();
	}

	public BusinessReview(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	@Id
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "reviews", nullable = false)
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
