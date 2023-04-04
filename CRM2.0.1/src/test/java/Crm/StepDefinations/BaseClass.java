package Crm.StepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import Crm.PageObjects.LoginPage;

public class BaseClass {
	public WebDriver driver;
	Properties prop ;
	public String getproperty(String url) throws IOException {
		prop= new Properties();
	FileInputStream fis = new FileInputStream("./config.properties");
	prop.load(fis);
	return prop.getProperty(url);
	}
	
     public void launchapplication(String url) {
    	 driver.get(prop.getProperty(url));
    	
		
	     
    }
	
	
		
		
	
	
	

	

}
