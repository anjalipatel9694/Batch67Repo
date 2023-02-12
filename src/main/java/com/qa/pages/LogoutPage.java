package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LogoutPage extends TestBase  {

	//Page Factory
	@FindBy(id = "avatar-menu-button")
	WebElement user;
	
	@FindBy(xpath = "//span[contains(text(),'Log out')]")
	WebElement logout;
	
	public LogoutPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void verifyLogout() {
		user.click();
		logout.click();
	}

}
