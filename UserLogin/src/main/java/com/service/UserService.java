package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.User;
import com.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public String addUser(User user) {
		if(user.getSalary()<18) {
			return "User salary must be > 10000";
		}else if(userDao.addUserDetails(user)>0){
			return "Product details stored successfully";
		}else {
			return "Product details didn't store";
		}
	}
	
	public String updateUser(User user) {
		if(userDao.updateUserDetails(user)>0) {
			return "Record updated successfully";
		}else {
			return "Record didn't update";
		}
	}
	
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}
	

}
