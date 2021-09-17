package com.CRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	//page factory -Object repository
	
	@FindBy(xpath="//a[normalize-space()='Welcome Paul']")
	WebElement UserNameverification;
	
	@FindBy(xpath="//b[normalize-space()='PIM']")
	WebElement pimlink;
	
	@FindBy(xpath="//b[normalize-space()='Leave']")
	WebElement leavelink;
	
	//Initialization the page objects
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifytitlepage() {
		return driver.getTitle();
	}
	
	public PimPage clickpimlink() {
		pimlink.click();
		return new PimPage();
		
	}
	public LeavePage clickonleavelink() {
		leavelink.click();
		return new LeavePage();
	}
	
	
	
}
