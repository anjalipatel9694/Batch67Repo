package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//@FindBy(xpath = "//div[@class='surface-navigation-dialog-item-component']")
	//WebElement notificationLink;
	
	@FindBy(xpath = "//img[@class=\"surface-item-image\"]")
	WebElement homepageLink;
	
	@FindBy(xpath = "//div[@class='surface-navigation-dialog-item-component']")
	WebElement notificationLink;
	
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public HomePage verifyHomePageLinkPresent() throws IOException {
		//return homepageLink.isDisplayed();
		Actions actions = new Actions(driver);
		actions.moveToElement(homepageLink).click().build().perform();
		return new HomePage();
		
	}
	
	public void verifyNotificationLinkPresent() throws IOException {
		//return notificationLink.isDisplayed();
		Actions actions = new Actions(driver);
		actions.moveToElement(notificationLink).click().build().perform();
		//return new NotificationPage();
	}

}
