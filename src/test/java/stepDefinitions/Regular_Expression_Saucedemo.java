package stepDefinitions;

import io.cucumber.java.en.When;

public class Regular_Expression_Saucedemo {
	
	@When("^the user can enter Username as \"(.*?)\"$")
	public void the_user_can_enter_username_as(String Username) {
	    System.out.println("The username is :" + Username);
	    
	}
	@When("^the user can enter password as \"(.*?)\"$")
	public void the_user_can_enter_password_as(String Password) {
		System.out.println("The password is :" + Password);
	}
	
	@When("the user can enter ID as (\\d+)$")
	public void the_user_can_enter_ID_as(Integer Passwordint) {
		System.out.println("The ID is :" + Passwordint);
	}
	
	
	
}