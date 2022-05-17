package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "business_is_open")
public class BusinessIsOpen {
	@Id
	private int is_open;

	private int closed;

	public BusinessIsOpen(int is_open, int closed) {
		super();
		this.is_open = is_open;
		this.closed = closed;
	}

	public BusinessIsOpen() {
		super();
	}

	@Id
	public int getIs_open() {
		return is_open;
	}

	public void setIs_open(int is_open) {
		this.is_open = is_open;
	}

	@Column(name = "closed", nullable = false)
	public int getClosed() {
		return closed;
	}

	public void setClosed(int closed) {
		this.closed = closed;
	}

}
