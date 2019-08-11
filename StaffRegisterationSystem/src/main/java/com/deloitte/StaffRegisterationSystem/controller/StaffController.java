package com.deloitte.StaffRegisterationSystem.controller;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deloitte.StaffRegisterationSystem.dao.StaffRepository;
import com.deloitte.StaffRegisterationSystem.exceptions.BusinessException;
import com.deloitte.StaffRegisterationSystem.model.Staff_Info;
import com.deloitte.StaffRegisterationSystem.services.Staff_Info_Validations;

@Controller
public class StaffController {
	@Autowired
	StaffRepository staffrepo;
	
	//@Autowired
	//Staff_Info_Validations staffvalid;
	
	Staff_Info_Validations staffvalid=new Staff_Info_Validations();
	
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addStaff")
	public String addEmployee(Staff_Info SI) throws BusinessException{
		long maxRegister=staffrepo.count();
		String staff_id="S"+maxRegister;
		
		LocalDate dob=SI.getDate_of_birth().toLocalDate();
		staffvalid.saveStaff(SI);
		return "home.jsp";
	}
}
