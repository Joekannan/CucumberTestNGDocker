package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
public static WebDriver driver;
	
	
	public void initialisationDriver(String Browser) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		if(Browser.equalsIgnoreCase("CHROME")) {
			caps.setBrowserName(BrowserType.CHROME);
			WebDriverManager.chromedriver().setup();
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps);
		}
		else if (Browser.equalsIgnoreCase("FIREFOX")) {
			caps.setBrowserName(BrowserType.FIREFOX);
			WebDriverManager.firefoxdriver().setup();
			driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),caps);
		}
		else if (Browser.equalsIgnoreCase("EDGE")) {
			caps.setBrowserName(BrowserType.EDGE);
			WebDriverManager.edgedriver().setup();
			driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"),caps);
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.thewarehouse.co.nz/");
	}
	
	
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
	
	public static String randomName() {
		Faker faker = new Faker();
		return faker.name().firstName();
	}

}
