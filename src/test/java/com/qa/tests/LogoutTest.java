package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.LogoutPage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class LogoutTest extends TestBase {

	public LogoutTest() throws IOException {
		super();
	}
	
	LoginPage loginpage;
	LogoutPage logoutpage;

	@BeforeMethod
	public void beforeMethod() throws IOException {
		initialization();
		loginpage = new LoginPage();
		logoutpage = new LogoutPage();
		loginpage.clickLoginLink();
		loginpage.enterCorrectEmailandPassword(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Test
	public void VerifyLogoutTest() {
		logoutpage.verifyLogout();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
