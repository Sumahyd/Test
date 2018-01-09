package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()  {
	    
	   System.out.println("home page ");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page()  {
		System.out.println("login page ");
	    
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password()  {
	    
		System.out.println("username  ");
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    
		System.out.println("login successful ");
	}
}
