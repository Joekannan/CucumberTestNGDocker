package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import utility.BaseTest;

public class RegistrationStepDef extends BaseTest {
	
	RegisterPage rp;
	
	public RegistrationStepDef() {
		super();
	}
	
	@When("I click Register")
	public void i_click_register() {
		rp = new RegisterPage();
		rp.clickRegister();
	    
	}

	@When("I enter required details")
	public void i_enter_required_details() {
		rp.enterFirstName();
		rp.enterLastName();
		rp.enterEmail();
		rp.enterPassword();
		rp.enterConfirmPassword();
		rp.clickSignUp();
	    
	}

	@Then("I should see successful registration")
	public void i_should_see_successful_registration() {
	    rp.validateRegistration();
	}
	
	

}
