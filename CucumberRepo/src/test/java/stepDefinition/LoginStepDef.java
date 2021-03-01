package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utility.BaseTest;

public class LoginStepDef extends BaseTest {
	
	LoginPage lp;
	
	public LoginStepDef() {
		super();
	}
	
	@Given("I am on the Home Page")
	public void i_am_on_the_home_page() {
		try {
			//the below is a testng assertion. To do a contains assertion, use Junit hamcrest
			Assert.assertEquals("https://www.thewarehouse.co.nz/", driver.getCurrentUrl());
//			assertThat(driver.getCurrentUrl(), containsString("home"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@When("I enter my {string} and {string}")
	public void i_enter_my_and(String Username, String Password) {
		lp = new LoginPage();
		lp.clickSignIn();
		lp.enterUserName(Username);
		lp.enterPassword(Password);
		lp.clickLogin();
	}

	@Then("I should see the MyAccount page")
	public void i_should_see_the_my_account_page() {
		lp.verifyLogOut();
		
	}

}
