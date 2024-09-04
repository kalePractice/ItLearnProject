package com.itLearn.testcases;

import org.testng.annotations.Test;

import com.itLearn.pages.BaseTest;
import com.itLearn.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	void verifyLogin()
	{
		LoginPage lp=new LoginPage(driver);
		String username="Demo12";
		String password="Test123456$";
		lp.loginPortal(username, password);
	}
	
}
