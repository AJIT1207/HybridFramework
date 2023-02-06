package com.hybrid.testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hybrid.pageObjects.LoginPage;

public class TC001_LoginTest extends BaseClass

{

	@Test
	public void loginTest()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		LoginPage l  = new LoginPage(driver);
		
		l.setUsername(username);
		l.setPassword(password);
		l.login();
		
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}

			


}
