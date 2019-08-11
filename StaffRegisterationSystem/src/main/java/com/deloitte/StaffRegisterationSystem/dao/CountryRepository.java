package com.deloitte.StaffRegisterationSystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.deloitte.StaffRegisterationSystem.model.Country_Info;

public interface CountryRepository extends CrudRepository<Country_Info, String>{

}
