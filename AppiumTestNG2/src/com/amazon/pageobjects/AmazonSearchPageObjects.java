package com.amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AmazonSearchPageObjects {
public static AppiumDriver driver;
	
	//Define the locators using keyword
	
	By SearchBox = By.xpath("//*[@class=\"nav-input nav-progressive-attribute\"]");
	
	By SearchIcon = By.xpath("//*[@class=\"nav-input\"]");
	
	public AmazonSearchPageObjects(AppiumDriver driver)
	{
		
		this.driver = driver;
			
	}
	

	public void EnterSearchTerm(String testdata)
	{
		driver.findElement(SearchBox).sendKeys(testdata);
	}
	public WebElement SearchTextBox()
	{
		return driver.findElement(SearchBox);
	}
	
	public void ClickonSearchIcon()
	{
		driver.findElement(SearchIcon).click();
	}

}
