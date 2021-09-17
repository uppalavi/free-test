package com.CRM.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.HomePage;
import com.CRM.qa.pages.LoginPage;

public class LoginpageTest extends TestBase{
		LoginPage loginpage;
	
	 HomePage homePage;
	 //mahesh:
	 
	public LoginpageTest(){
		super();
		
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage =new LoginPage();
		
	}
	
	 @Test(priority=1)
	
	public void logoinpage() {
	String act_title=loginpage.validloginpageTitle();
	Assert.assertEquals(act_title, "OrangeHRM");
	}
	 
   @Test(priority=2,dependsOnMethods= {"logoinpage"})
   public void validData() {
	homePage=  loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	  	
}
   @Test(priority=3)
   public void img() {
  Assert.assertTrue(loginpage.validateimg());
	   
   }
		
	@AfterMethod
	public void TearDown() {
		driver.close();
	}
	
	

}
