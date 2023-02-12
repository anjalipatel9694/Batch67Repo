package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import com.qa.base.TestBase;

public class WorkspacePage extends TestBase {
	
		//Page factory
	
	@FindBy(xpath = "//a[@aria-label=\"work management\"]")
	WebElement workmanagement;
	
	@FindBy(xpath = "//div[@class=\"first-level-control-component\"]")
	WebElement workspace;
	
	@FindBy(xpath = "//div[@class=\"collapse-first-level-button-component is-unpinned\"]")
	WebElement navigationbtn;
	
	@FindBy(xpath = "//button[@id='menuButton_5']")
	WebElement add;
	
	public WorkspacePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public void workspacehover() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		workmanagement.click();
		actions.moveToElement(navigationbtn).click().build().perform();
		add.click();
	}
	
	
}
	
	
	


