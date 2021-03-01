package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.BaseTest;

public class RegisterPage extends BaseTest{
	
//	WebDriver driver;
	
	@FindBy(xpath = "//a[@data-twg-id='header-register-desktop']")
	WebElement lnkRegister;
	
	@FindBy(id = "dwfrm_profile_customer_firstname")
	WebElement txtFirstName;

	@FindBy(id = "dwfrm_profile_customer_lastname")
	WebElement txtLastName;
	
	@FindBy(id = "dwfrm_profile_customer_email")
	WebElement txtEmail;
	
	@FindBy(id = "dwfrm_profile_login_password")
	WebElement txtPassword;
	
	@FindBy(id = "dwfrm_profile_login_passwordconfirm")
	WebElement txtConfirmPassword;
	
	@FindBy(name = "dwfrm_profile_confirm")
	WebElement btnSignUp;
	
	
	
	public RegisterPage() {
		super();
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void enterFirstName() {
		txtFirstName.sendKeys(BaseTest.randomName());
	}
	
	public void enterLastName() {
		txtLastName.sendKeys(BaseTest.randomName());
	}
	
	public void enterEmail() {
		txtEmail.sendKeys(BaseTest.randomName()+"@testmail.com");
	}
	
	public void enterPassword() {
		txtPassword.sendKeys("Test1234");
	}
	
	public void enterConfirmPassword() {
		txtConfirmPassword.sendKeys("Test1234");
	}
	
	public void clickSignUp() {
		btnSignUp.click();
	}
	
	public void validateRegistration() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.thewarehouse.co.nz/account?accountCreated=true");
	}
}
