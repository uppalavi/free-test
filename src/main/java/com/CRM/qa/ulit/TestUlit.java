package com.CRM.qa.ulit;

import com.CRM.qa.base.TestBase;

public class TestUlit extends TestBase {

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	
	public void switchToframe() {
		driver.switchTo().frame("");
	}
	
	
}
