package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.WorkspacePage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class WorkspaceTest extends TestBase {
	
	
	public WorkspaceTest() throws IOException {
		super();
		
	}

	WorkspacePage workspacepage;
	LoginPage loginpage;
	
	
	
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  initialization();
	  workspacepage = new WorkspacePage();
	  loginpage = new LoginPage();
	  loginpage.clickLoginLink();
	  loginpage.enterCorrectEmailandPassword(prop.getProperty("email"), prop.getProperty("password"));
	  
  }
  
  @Test
  public void workspacehoverTest() throws InterruptedException {
	  workspacepage.workspacehover();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
