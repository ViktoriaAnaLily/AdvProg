package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fridayuntil23")
public class FridayUntil23 {
	@Id
	private String business_id;
	private String name;
	private String friday;

	public FridayUntil23() {
		super();
	}

	public FridayUntil23(String business_id, String name, String friday) {
		super();
		this.business_id = business_id;
		this.name = name;
		this.friday = friday;
	}

	@Id
	public String getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}

	@Column(name = "name", nullable = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "friday", nullable = true)
	public String getFriday() {
		return friday;
	}

	public void setFriday(String friday) {
		this.friday = friday;
	}

}