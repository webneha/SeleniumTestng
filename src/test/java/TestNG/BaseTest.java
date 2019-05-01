package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	@BeforeSuite
	public void setup()
	{
		System.out.println("Intializing the setup");
	
	}
	@AfterSuite
	public void quit()
	{
		System.out.println("Quitting the setup");
	}

}
