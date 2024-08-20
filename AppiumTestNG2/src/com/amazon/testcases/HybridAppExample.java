package com.amazon.testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class HybridAppExample{

public static AppiumDriver driver;
	
@BeforeClass
//@Test
	public void OpenApp() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options options = new UiAutomator2Options()
				.setPlatformName("Android")
				.setDeviceName("emulator-5554")
				.setAppPackage("com.android.chrome")
				.setAppActivity("com.google.android.apps.chrome.Main")
				.setNoReset(true);
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		Thread.sleep(5000);
	}
	
	private void setNoReset(boolean b) {
	// TODO Auto-generated method stub
	
}

	@Test
	public void SeekBarHandle() throws InterruptedException, IOException
	{
		driver.get("https://www.amazon.com");
		
		Thread.sleep(10000);
	}
	
@AfterClass
	
	public void teardown()
	{
	
		driver.quit();
	
	}
}

