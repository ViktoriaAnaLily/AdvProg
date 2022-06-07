package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "businessdateinew")
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
	private String mondayopen;
	private String mondayclosed;
	private String thuesdayopen;
	private String thuesdayclosed;
	private String wednesdayopen;
	private String wednesdayclosed;
	private String thursdayopen;
	private String thursdayclosed;
	private String fridayopen;
	private String fridayclosed;
	private String saturdayopen;
	private String saturdayclosed;
	private String sundayopen;
	private String sundayclosed;
	
	

	public Business() {
		super();
	}

	

	public Business(String business_id, String name, String address, String city, String state, String postal_code,
			String latitude, String longitude, String stars, int review_count, int is_open, String attributes,
			String categories, String mondayopen, String mondayclosed, String thuesdayopen, String thuesdayclosed,
			String wednesdayopen, String wednesdayclosed, String thursdayopen, String thursdayclosed, String fridayopen,
			String fridayclosed, String saturdayopen, String saturdayclosed, String sundayopen, String sundayclosed) {
		super();
		this.business_id = business_id;
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
		this.mondayopen = mondayopen;
		this.mondayclosed = mondayclosed;
		this.thuesdayopen = thuesdayopen;
		this.thuesdayclosed = thuesdayclosed;
		this.wednesdayopen = wednesdayopen;
		this.wednesdayclosed = wednesdayclosed;
		this.thursdayopen = thursdayopen;
		this.thursdayclosed = thursdayclosed;
		this.fridayopen = fridayopen;
		this.fridayclosed = fridayclosed;
		this.saturdayopen = saturdayopen;
		this.saturdayclosed = saturdayclosed;
		this.sundayopen = sundayopen;
		this.sundayclosed = sundayclosed;
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


	@Column(name = "mondayopen", nullable = true)
	public String getMondayopen() {
		return mondayopen;
	}



	public void setMondayopen(String mondayopen) {
		this.mondayopen = mondayopen;
	}


	@Column(name = "mondayclosed", nullable = true)
	public String getMondayclosed() {
		return mondayclosed;
	}



	public void setMondayclosed(String mondayclosed) {
		this.mondayclosed = mondayclosed;
	}


	@Column(name = "thuesdayopen", nullable = true)
	public String getThuesdayopen() {
		return thuesdayopen;
	}



	public void setThuesdayopen(String thuesdayopen) {
		this.thuesdayopen = thuesdayopen;
	}


	@Column(name = "thuesdayclosed", nullable = true)
	public String getThuesdayclosed() {
		return thuesdayclosed;
	}



	public void setThuesdayclosed(String thuesdayclosed) {
		this.thuesdayclosed = thuesdayclosed;
	}


	@Column(name = "wednesdayopen", nullable = true)
	public String getWednesdayopen() {
		return wednesdayopen;
	}



	public void setWednesdayopen(String wednesdayopen) {
		this.wednesdayopen = wednesdayopen;
	}


	@Column(name = "wednesdayclosed", nullable = true)
	public String getWednesdayclosed() {
		return wednesdayclosed;
	}



	public void setWednesdayclosed(String wednesdayclosed) {
		this.wednesdayclosed = wednesdayclosed;
	}


	@Column(name = "thursdayopen", nullable = true)
	public String getThursdayopen() {
		return thursdayopen;
	}



	public void setThursdayopen(String thursdayopen) {
		this.thursdayopen = thursdayopen;
	}


	@Column(name = "thursdayclosed", nullable = true)
	public String getThursdayclosed() {
		return thursdayclosed;
	}



	public void setThursdayclosed(String thursdayclosed) {
		this.thursdayclosed = thursdayclosed;
	}


	@Column(name = "fridayopen", nullable = true)
	public String getFridayopen() {
		return fridayopen;
	}



	public void setFridayopen(String fridayopen) {
		this.fridayopen = fridayopen;
	}


	@Column(name = "fridayclosed", nullable = true)
	public String getFridayclosed() {
		return fridayclosed;
	}



	public void setFridayclosed(String fridayclosed) {
		this.fridayclosed = fridayclosed;
	}


	@Column(name = "saturdayopen", nullable = true)
	public String getSaturdayopen() {
		return saturdayopen;
	}



	public void setSaturdayopen(String saturdayopen) {
		this.saturdayopen = saturdayopen;
	}


	@Column(name = "saturdayclosed", nullable = true)
	public String getSaturdayclosed() {
		return saturdayclosed;
	}



	public void setSaturdayclosed(String saturdayclosed) {
		this.saturdayclosed = saturdayclosed;
	}


	@Column(name = "sundayopen", nullable = true)
	public String getSundayopen() {
		return sundayopen;
	}



	public void setSundayopen(String sundayopen) {
		this.sundayopen = sundayopen;
	}


	@Column(name = "sundayclosed", nullable = true)
	public String getSundayclosed() {
		return sundayclosed;
	}



	public void setSundayclosed(String sundayclosed) {
		this.sundayclosed = sundayclosed;
	}

	

}
