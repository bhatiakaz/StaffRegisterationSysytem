package com.deloitte.StaffRegisterationSystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.deloitte.StaffRegisterationSystem.model.Staff_Salary;

public interface SalaryRepository extends CrudRepository<Staff_Salary,Integer>{

}
