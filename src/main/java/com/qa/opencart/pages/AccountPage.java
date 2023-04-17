package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utilities.ElementUtil;

public class AccountPage {
	
//1. private WebDriver ref and ElementUtil reference
	private WebDriver driver;
	private ElementUtil eleUtil;
	
//2. constructor of AccountPage
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		this.eleUtil = new ElementUtil(driver);
	}	
	
//3. By locators
	private By accLink = By.xpath("//a[text() = \"Account\"]");
	
//	4. Functionalities
	public boolean isAccountLinkDisplayed() {
		return eleUtil.isDisplayed(accLink);
	}
	
	
	

}
