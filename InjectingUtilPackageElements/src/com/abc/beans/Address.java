package com.abc.beans;

public class Address {

	private String pno;
	private String city;
	private String state;
	private String country;

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "[pno=" + pno + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
