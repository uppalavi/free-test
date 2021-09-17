package com.CRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory -Object repository
	
	
	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement signbtn;
	
	@FindBy(xpath="//*[@id=\"divLogo\"]/img")
	WebElement Logoimg;
	
	
	//Initialization the page objects
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
			
	}
	
	public String  validloginpageTitle() {
		return driver.getTitle();
	}

    public boolean validateimg() {
	return  Logoimg.isDisplayed();
 }
    public HomePage login(String un,String pwd) {
 	 username.sendKeys(un);
	 password.sendKeys(pwd);
	  signbtn.click();
	  
	  
	 return new HomePage();
 }
  
	  
	 
  

}
