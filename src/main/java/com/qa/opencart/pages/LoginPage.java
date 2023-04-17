package com.qa.opencart.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utilities.ElementUtil;
public class LoginPage {
	//1. private WebDriver instance - for loginPage usage only
		private WebDriver driver;
		private ElementUtil eleUtil ;
	
	//2. constructor
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			this.eleUtil = new ElementUtil(driver);
		}
	//3.  By Locators
		private By email = By.name("email");
		private By password = By.id("input-password");
		private By login_Btn = By.xpath("//input[@value = 'Login']");
	
	//4. Functionalities of the page
		public AccountPage doLogin(String uname, String pwd) {
			eleUtil.doSendKeys(email, uname);
			eleUtil.doSendKeys(password, pwd);
			eleUtil.doClick(login_Btn);
			System.out.println("uname and psswrd are entered and login clicked");
			return new AccountPage(driver);
		}
}
