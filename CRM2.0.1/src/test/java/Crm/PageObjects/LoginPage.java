package Crm.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
       WebDriver ldriver;
	   public LoginPage(WebDriver rdriver) {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver,this);
		   }
	  
	   @FindBy(id="username") private WebElement usernameTF;
	   @FindBy(id="password") private WebElement passwordTF;
	   @FindBy(xpath="//button[text()=' Login ']") private WebElement LoginBtn;
	   
	   public void setusername(String username) {
		   usernameTF.clear();
		   usernameTF.sendKeys(username);
	   }
	   
	   public void setpassword(String password) {
		   passwordTF.clear();
		   passwordTF.sendKeys(password);
	   }
	   
	   public void clickloginbutton() {
		   LoginBtn.click();
	   }
}
