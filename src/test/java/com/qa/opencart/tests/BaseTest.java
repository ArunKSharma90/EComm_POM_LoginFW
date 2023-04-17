package com.qa.opencart.tests;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	DriverFactory df;
	Properties prop;
	WebDriver driver;
	LoginPage lgnPage;
	AccountPage accPage;
	
	@BeforeTest
	public void setup()  {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		lgnPage = new LoginPage(driver);
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}
