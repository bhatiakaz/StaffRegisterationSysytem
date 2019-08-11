package com.deloitte.StaffRegisterationSystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.deloitte.StaffRegisterationSystem.model.Staff_Info;

public interface StaffRepository extends CrudRepository<Staff_Info,String>{
	
	public boolean existsByEmail(String email);
	public long count();
}