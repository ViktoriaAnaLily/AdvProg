package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "business")
public class Business {
	@Id
	private String business_id;

	private String name;
	private String address;
	private String city;
	private String state;
	private String postal_code;
	private String latitude;
	private String longitude;
	private String stars;
	private int review_count;
	private int is_open;
	private String attributes;
	private String categories;
	private String monday;
	private String thuesday;
	private String wednesday;
	private String thursday;
	private String friday;
	private String saturday;
	private String sunday;
	
	

	public Business() {
		super();
	}

	public Business(String name, String address, String city, String state, String postal_code,
			String latitude, String longitude, String stars, int review_count, int is_open, String attributes,
			String categories, String monday, String thuesday, String wednesday, String thursday, String friday,
			String saturday, String sunday) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postal_code = postal_code;
		this.latitude = latitude;
		this.longitude = longitude;
		this.stars = stars;
		this.review_count = review_count;
		this.is_open = is_open;
		this.attributes = attributes;
		this.categories = categories;
		this.monday = monday;
		this.thuesday = thuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.sunday = sunday;
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

	@Column(name = "address", nullable = true)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "city", nullable = true)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state", nullable = true)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "postal_code", nullable = true)
	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
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

	@Column(name = "stars", nullable = true)
	public String getStars() {
		return stars;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

	@Column(name = "review_count", nullable = true)
	public int getReview_count() {
		return review_count;
	}

	public void setReview_count(int review_count) {
		this.review_count = review_count;
	}

	@Column(name = "is_open", nullable = true)
	public int getIs_open() {
		return is_open;
	}

	public void setIs_open(int is_open) {
		this.is_open = is_open;
	}

	@Column(name = "attributes", nullable = true)
	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	@Column(name = "categories", nullable = true)
	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	@Column(name = "monday", nullable = true)
	public String getMonday() {
		return monday;
	}

	public void setMonday(String monday) {
		this.monday = monday;
	}

	@Column(name = "thuesday", nullable = true)
	public String getThuesday() {
		return thuesday;
	}

	public void setThuesday(String thuesday) {
		this.thuesday = thuesday;
	}

	@Column(name = "wednesday", nullable = true)
	public String getWednesday() {
		return wednesday;
	}

	public void setWednesday(String wednesday) {
		this.wednesday = wednesday;
	}

	@Column(name = "thursday", nullable = true)
	public String getThursday() {
		return thursday;
	}

	public void setThursday(String thursday) {
		this.thursday = thursday;
	}

	@Column(name = "friday", nullable = true)
	public String getFriday() {
		return friday;
	}

	public void setFriday(String friday) {
		this.friday = friday;
	}

	@Column(name = "saturday", nullable = true)
	public String getSaturday() {
		return saturday;
	}

	public void setSaturday(String saturday) {
		this.saturday = saturday;
	}

	@Column(name = "sunday", nullable = true)
	public String getSunday() {
		return sunday;
	}

	public void setSunday(String sunday) {
		this.sunday = sunday;
	}

}
