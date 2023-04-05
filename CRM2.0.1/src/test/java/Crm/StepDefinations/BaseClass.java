package Crm.StepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.neogrowth.GenricUtils.PropertyUtility;
import com.crm.neogrowth.GenricUtils.WebDriverUtility;

import Crm.PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	PropertyUtility propUtility= new PropertyUtility();
	WebDriverUtility commanUtility=new WebDriverUtility(driver);
	LoginPage Lpage=new LoginPage(driver);
	
	 @BeforeClass()
	 public void launchbrowser() throws IOException  {
		 String brow = propUtility.getproperty("browser");
		 
		 if (brow.equals("chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver",propUtility.getproperty("chromepath"));
			 driver=new ChromeDriver();
			
		 }
		 else if(brow.equals("firefox")) {
			 
			 System.setProperty("webdriver.gecko.driver",propUtility.getproperty("firefoxpath"));
			 driver=new FirefoxDriver();
		 }
		
		 commanUtility.implcitywait(10);
		 driver.manage().window().maximize();
	 }
		 
	    public void launchapp() throws IOException {
		 driver.get(propUtility.getproperty("url"));
	 }
		 
	  
		 @Before()
		 public void Loginapplication() throws IOException {
         Lpage.setusername(propUtility.getproperty("username"));
         Lpage.setpassword(propUtility.getproperty("password"));
         Lpage.clickloginbutton();
         	 
		 }
	 
	 }
	 
	     
    
	
	
		
		
	
	
	

	


