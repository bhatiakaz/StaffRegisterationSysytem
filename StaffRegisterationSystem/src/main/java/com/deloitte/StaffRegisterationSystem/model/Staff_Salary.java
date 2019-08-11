package com.deloitte.StaffRegisterationSystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff_Salary {
	
	@Id
	private int salary;
	
	private int years_of_experience;
	private String highest_qualification;
	
	public Staff_Salary() {}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getYears_of_experience() {
		return years_of_experience;
	}
	public void setYears_of_experience(int years_of_experience) {
		this.years_of_experience = years_of_experience;
	}
	public String getHighest_qualification() {
		return highest_qualification;
	}
	public void setHighest_qualification(String highest_qualification) {
		this.highest_qualification = highest_qualification;
	}
	@Override
	public String toString() {
		return "STAFF_SALARY [salary=" + salary + ", years_of_experience=" + years_of_experience
				+ ", highest_qualification=" + highest_qualification + "]";
	}
	
	
}
