package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.BaseTest;

public class LoginPage extends BaseTest {
	
//	WebDriver driver;
	
	@FindBy(xpath = ".//a[@data-twg-id ='header-login-desktop']")
	WebElement btnSignIn;
	
	@FindBy(xpath = ".//input[contains(@id,'dwfrm_login_username')]")
	WebElement txtUserName;
	
	
	@FindBy(id = "dwfrm_login_password")
	WebElement txtPassword;
	
	@FindBy(name = "dwfrm_login_login")
	WebElement btnLogin;
	
	@FindBy(xpath = ".//a[@title='Log Out' and @data-twg-id='header-logout-desktop'] ")
	WebElement lnkLogOut;
	
	public LoginPage() {
		super();
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSignIn() {
		btnSignIn.click();
		
	}
	
	public void enterUserName() {
		txtUserName.sendKeys("shireenkamra@gmail.com");
		
	}
	
	public void enterPassword() {
		txtPassword.sendKeys("Shireen12");
		
	}
	
	public void clickLogin() {
		btnLogin.click();
		
	}
	
	public void verifyLogOut() {
		Assert.assertTrue(lnkLogOut.isDisplayed());
		
	}

	public void enterUserName(String username) {
		txtUserName.sendKeys(username);
		
	}

	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
		// TODO Auto-generated method stub
		
	}
	
	

}
