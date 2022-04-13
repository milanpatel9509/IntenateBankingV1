package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseClass 
{
	public String baseURL="https://demo.guru99.com/V1/index.php";
	public String username="mngr371460";
	public String password="AgAveqa";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
}
