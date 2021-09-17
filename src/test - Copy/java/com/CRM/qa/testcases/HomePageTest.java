






package com.CRM.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.HomePage;
import com.CRM.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	 HomePage homePage;
	 
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		TestBase.initialization();
		loginpage =new LoginPage();
		homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	@Test
	public void Titleverification() {
		homePage.verifytitlepage();
	}
	@Test
	 public void PimLinkclick() {
		 homePage.clickpimlink();
		 
	 }
	@Test
	 public void LeaveLink() {
		 homePage.clickonleavelink();

		 }

	@AfterMethod
	public void teradown() {
		driver.close();
	}
}
