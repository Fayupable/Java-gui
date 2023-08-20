package com.hibernateDemo;

import org.hibernate.annotations.*;

@Entity

@Table(name = "city")

public class city {
	@Id
	@Column(name = "ID")
	
	private int id;
	private String name;
	private String countryCode;
	private String district;
	private String info;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
