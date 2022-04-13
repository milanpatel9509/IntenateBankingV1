package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;



public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws InterruptedException 
	{
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		
		System.out.println(username);
		System.out.println(password);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		Assert.assertEquals(driver.getTitle(),"GTPL Bank Manager HomePage");
		
	}
	
}
