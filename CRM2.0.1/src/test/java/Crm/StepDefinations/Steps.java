package Crm.StepDefinations;

import java.io.IOException;

import Crm.PageObjects.LoginPage;
import cucumber.api.java.en.*;

public class Steps extends BaseClass{

	public LoginPage loginpage;
	
	@Given("when user launch the browser")
	public void when_user_launch_the_browser() throws IOException {
		launchbrowser() ;
	}

	@When("Users open url")
	public void users_open_url() throws IOException {
	    launchapp();
	}
	
	 @And("Enter {string} and {string} into the TF and click on loginButton")
	 public void enter_and_into_the_tf_and_click_on_login_button(String username, String password) throws IOException {
	     Loginapplication();
	 }
}
	

	

