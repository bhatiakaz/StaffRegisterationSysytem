package com.deloitte.StaffRegisterationSystem.exceptions;

public class BusinessException  extends Exception
{
	public BusinessException(int code)
	{
		String msg;
		switch(code)
		{
		case 507:
				msg="Staff name contains characters other than alphabets and space.";
				System.out.println(msg);
				break;
		case 502:
			msg="Email Id doesnot contain '@'.";
			System.out.println(msg);
			break;
		case 508:
			msg="Email Id already exists.";
			System.out.println(msg);
			break;
		case 509:
			msg="Staff experience is greater than 37.";
			System.out.println(msg);
			break;
		case 504:
			
			msg="DOB greater than System Date -";
			System.out.println(msg+" "+java.time.LocalDate.now());
			break;
		case 505:
			msg="DOJ less than System Date -";
			System.out.println(msg+" "+java.time.LocalDate.now());
			break;
		case 506:
			msg="Contact number contains albhabet or contain more than 10 digits.";
			System.out.println(msg);
			break;
		}
		
	}
}