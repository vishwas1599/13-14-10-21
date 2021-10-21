package com.dxc;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	private String doorNo;
	private String street;
	private String city;
	private String State;
	private String pin;
	
	public Address() {
		super();
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", State=" + State + ", pin="
				+ pin + "]";
	}
	
	

}
