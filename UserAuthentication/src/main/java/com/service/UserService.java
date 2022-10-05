package com.service;

public class UserService {
	public String checkUser(String emailid, String password)
	{
		if(emailid.equals("pre@gmail.com")&& password.equals("123"))
		{
			System.out.println("authentication approved!");
			return "success";
		}
		else
		{
			
			return "failure";
		}
	}

}
