package com.deloitte.StaffRegisterationSystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country_Info {
	@Id
	private String country_id;
	private String country_name;
	private String state_name;
	
	public Country_Info() {
		// TODO Auto-generated constructor stub
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	@Override
	public String toString() {
		return "COUNTRY_INFO [country_id=" + country_id + ", country_name=" + country_name + ", state_name="
				+ state_name + "]";
	}
	
	
	
}
