package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(priority =1 , groups = "functional")
public class TestCase1 extends BaseTest {
	WebDriver driver;
	@Test(priority = 1)
	public void doLogin() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin");

	}
	@Test(priority = 2 , groups = {"functional","smoke"})
	public void ValidateTitle() {
		String expected_Title = "Sign in – Google accounts";
		String actual_Title = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actual_Title, expected_Title);
		
	
		System.out.println("Title not matched");
		softassert.assertAll();
		
	}
	
	@AfterTest
	public void closeee() {
		driver.close();
	}
	
}
