package com.qa.opencart.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.opencart.pages.AccountPage;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void loginTest() {
		
		accPage = lgnPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
		Assert.assertTrue(accPage.isAccountLinkDisplayed());
	}
}
