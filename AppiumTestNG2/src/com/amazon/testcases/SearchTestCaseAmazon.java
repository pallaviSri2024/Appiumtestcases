package com.amazon.testcases;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.amazon.pageobjects.AmazonSearchPageObjects;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SearchTestCaseAmazon {
	
public static AppiumDriver driver;
	
	@BeforeClass
		
		public void OpenApp() throws MalformedURLException, InterruptedException
		{
			UiAutomator2Options options = new UiAutomator2Options()
						.setPlatformName("Android")
						.setDeviceName("emulator-5554")
						.setAppPackage("com.android.chrome")
						.setAppActivity("com.google.android.apps.chrome.Main");
						
						
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			
			Thread.sleep(5000);
		}


	@Test


	public void SeekBarHandle() throws InterruptedException, IOException
	{
		
	driver.get("https://www.amazon.in");
		
	Thread.sleep(5000);
		
	AmazonSearchPageObjects obj = new AmazonSearchPageObjects(driver);
	
	System.out.println(obj.SearchTextBox().isDisplayed());
	obj.EnterSearchTerm("Shirts");
	Thread.sleep(5000);
	obj.ClickonSearchIcon();
	Thread.sleep(5000);

	}
		
	@AfterClass


	public void teardown()
	{
		driver.quit();
	}


}
