package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "saturdayopen")
public class SaturdayOpen {

	@Id
	private int id;

	private String time;
	private String state;
	private int amount;

	public SaturdayOpen() {
		super();
	}

	public SaturdayOpen(int id, String time, String state, int amount) {
		super();
		this.id = id;
		this.time = time;
		this.state = state;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "time", nullable = false)
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Column(name = "state", nullable = false)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "amount", nullable = false)
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
