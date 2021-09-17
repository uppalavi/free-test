package com.CRM.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CRM.qa.ulit.TestUlit;

public class TestBase {
	
	public static  WebDriver driver; 
	public  static Properties prop;
 public TestBase() { 
	 
	 try {
		 prop=new Properties();
		 FileInputStream ip=new FileInputStream("C:\\Users\\Mahi\\eclipse-workspace\\freeCRMTest\\src\\main\\java\\com\\CRM\\qa\\config\\config.properties");
	 prop.load(ip);
	 }
	 catch(FileNotFoundException e) {
		 e.printStackTrace();
	 }catch(IOException e) {
		 e.printStackTrace();
	 }
 }
	
public static void initialization() {
	 String Browsername=prop.getProperty("browser");
	 if(Browsername.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver//chromedriver.exe");
		 driver=new ChromeDriver();
		
	 }else if(Browsername.equals("firefox")) 
	 { System.setProperty("webdriver.gecko.driver", "C://drivers//geckodriver//geckodriver.exe");
	 driver=new FirefoxDriver();
		 
	 }
	 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(TestUlit.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(TestUlit.IMPLICIT_WAIT, TimeUnit.SECONDS);
	 driver.get(prop.getProperty("url"));
}
 
 
 
 
}
