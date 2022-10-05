package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.service.UserService;


class AuthServiceTest {

	@Test
	
		//fail("Not yet implemented");
		@DisplayName("Check User details testing")
		void testCheckUser() {
			//fail("Not yet implemented");
			UserService as = new UserService();
			String result = as.checkUser("pre@gmail.com", "123");
			assertEquals("success", result);	
			String result1 = as.checkUser("ram@gmail.com", "123");
			assertEquals("failure", result1);
	}

}
