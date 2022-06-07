package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "businessstate")
public class BusinessState {
	@Id
	private String state;

	private int amount;

	public BusinessState() {
		super();
	}

	public BusinessState(String state, int amount) {
		super();
		this.state = state;
		this.amount = amount;
	}

	@Id
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
