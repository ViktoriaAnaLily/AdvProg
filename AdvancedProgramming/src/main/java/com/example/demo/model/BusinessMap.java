package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mapmap")
public class BusinessMap {
	@Id
	private int id;

	private String latitude;
	private String longitude;

	private String state;
	private String stars;

	public BusinessMap() {
		super();
	}

	public BusinessMap(int id, String latitude, String longitude, String state, String stars) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.state = state;
		this.stars = stars;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "latitude", nullable = true)
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude", nullable = true)
	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Column(name = "state", nullable = true)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "stars", nullable = true)
	public String getStars() {
		return stars;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

}
