package TestNG;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {
	WebDriver driver;
	@Test(priority = 1)
	public void doLogin() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin");
        Assert.fail("user not logged in successfully");

	}
	@Test(priority = 2, dependsOnMethods = "doLogin")
	public void ValidateTitle() {
		String expected_Title = "Sign in – Google accounts";
		String actual_Title = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actual_Title, expected_Title);
		
	
		System.out.println("Title not matched");
		softassert.assertAll();
		
	}
	
}