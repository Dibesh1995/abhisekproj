package com.flipkart.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	public WebDriver driver;
	@BeforeClass
	public void openBrowser() throws IOException
	{
		Reporter.log("open browser1111111",true);
		driver=new ChromeDriver();
		//driver.get();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login to the webapp");
		
	}

}
