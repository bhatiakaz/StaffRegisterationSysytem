package com.deloitte.StaffRegisterationSystem.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Staff_Info {
	
	@Id
	private String staff_id;
	private String staff_name;
	private Date date_of_birth;
	private String address;
	@OneToOne
	@JoinColumn
	private Country_Info country_id;
	private String gender;
	
	@OneToOne
	@JoinColumn
	private Staff_Salary salary;
	private String highest_qualification;
	private String email;
	private Long contact_number;
	private String designation;
	private Date year_passed_out;
	private int experience;
	private Date DOJ;
	
	
	public Staff_Info() {}
	
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHighest_qualification() {
		return highest_qualification;
	}
	public void setHighest_qualification(String highest_qualification) {
		this.highest_qualification = highest_qualification;
	}
	public String getEmail_id() {
		return email;
	}
	public void setEmail_id(String email_id) {
		this.email = email_id;
	}
	public Long getContact_number() {
		return contact_number;
	}
	public void setContact_number(Long contact_number) {
		this.contact_number = contact_number;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getYear_passed_out() {
		return year_passed_out;
	}
	public void setYear_passed_out(Date year_passed_out) {
		this.year_passed_out = year_passed_out;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}

	
}
