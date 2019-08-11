package com.deloitte.StaffRegisterationSystem.services;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;

import com.deloitte.StaffRegisterationSystem.dao.StaffRepository;
import com.deloitte.StaffRegisterationSystem.exceptions.BusinessException;
import com.deloitte.StaffRegisterationSystem.model.Staff_Info;


public class Staff_Info_Validations {
	@Autowired
	StaffRepository staffrepo;
	@Autowired
	Staff_Info SI;
	
	
	public void staffNameValidation(String str) throws BusinessException{
		
		if((str==null) || (str.matches("[0-9]")) || (str.matches("!@#$%^&*")))
				{
			throw new BusinessException(507);
		}
	}
	
	public void staffAgeValidation(Date dob) throws BusinessException
	{
		LocalDate today=LocalDate.now();
		LocalDate date=dob.toLocalDate();
		Period p=Period.between(date,today );
		if(p.getYears()>58 ||p.getYears()<21 ) {
			throw new BusinessException(504);
		}
		
	}
	
	public void ExperienceValidation(Date dob,Date YrPassed,int exp,String qual)  throws BusinessException{
		LocalDate today=LocalDate.now();
		LocalDate date=dob.toLocalDate();
		Period p=Period.between(date,today );
		
		LocalDate year=YrPassed.toLocalDate();
		Period q=Period.between(year,today );
		
		
		if(   (exp>p.getYears() || exp>q.getYears())){
			if((exp>37 && qual=="UG")) {
				throw new BusinessException(509);
			}
			else if((exp>34 && qual=="PG")) {
				throw new BusinessException(509);
			}
		}
	}
	
	
	
	public void EmailIdVerification(String email) throws BusinessException {
		
		if(email.contains("@")) {}
		else {
			throw new BusinessException(502);
			
		}
		
	}
	public void DOBValidation(Date dob) throws BusinessException {
		LocalDate today=LocalDate.now();
		LocalDate date=dob.toLocalDate();
		Period p=Period.between(date,today); 
		if(p.getYears()<=0) {
			 throw new BusinessException(504);
		 }
		
	}
	
	public void DOJValidation(Date doj) throws BusinessException {
		LocalDate today=LocalDate.now();
		LocalDate date=doj.toLocalDate();
		Period p=Period.between(date,today );
		 if(p.getYears()<=0) {
			 throw new BusinessException(504);
		 }
		
	}

	/*public void EmailExistsValidation(String email)  throws BusinessException{
		if(staffrepo.existsByEmail(email)) {
			throw new BusinessException(508);
		} 
	}*/
	
	public void ContactValidation(String contact)  throws BusinessException{
		
		if((contact.matches("[a-zA-Z]") || (contact.length()>10)))
				{
			throw new BusinessException(506);
		}
	}
	
	public int CalculateSal(String qual,int exp) {
		if(qual=="UG") {
			if(exp<=5) {
				return 20000;
			}
			else if(exp<=10) {
				return 25000;
			}
			else if(exp<=15) {
				
				return 30000;
			}
			else if(exp<=20) {
				return 35000;
			}
			else if(exp<=25) {
				return 40000;
			}
			else if(exp<=30) {
				return 25000;
			}
			else {
				return 50000;
			}
		}
		else {
			if(exp<=5) {
				return 26000;
			}
			else if(exp<=10) {
				return 31000;
			}
			else if(exp<=15) {
				
				return 36000;
			}
			else if(exp<=20) {
				return 41000;
			}
			else if(exp<=25) {
				return 46000;
			}
			else if(exp<=30) {
				return 51000;
			}
			else {
				return 56000;
			}
			
		}
	}
		public void saveStaff(Staff_Info SI) throws BusinessException
		{
			/*staffNameValidation(SI.getStaff_name());
			staffAgeValidation(SI.getDate_of_birth());
			ExperienceValidation(SI.getDate_of_birth(),SI.getYear_passed_out(),SI.getExperience(),SI.getHighest_qualification());
			EmailIdVerification(SI.getEmail_id());
			DOBValidation(SI.getDate_of_birth());
			DOJValidation(SI.getDOJ());
			//EmailExistsValidation(SI.getEmail_id());
			ContactValidation(SI.getContact_number().toString());
			*/
			staffrepo.save(SI);
			
		}
		
		
	}

