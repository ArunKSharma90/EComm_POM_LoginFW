package com.qa.opencart.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public List<WebElement> getElements(By locator) {
		List<WebElement> elementList = driver.findElements(locator);
		return elementList;
	}
	
	public void doSendKeys(By locator, String value) {
		WebElement ele = getElement(locator);
		ele.clear();
		ele.sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public boolean isDisplayed(By locator) {
		return getElement(locator).isDisplayed();
		
	}
	
	

	
	
	

}
