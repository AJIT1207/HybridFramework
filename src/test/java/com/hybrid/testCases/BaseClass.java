package com.hybrid.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	public String baseURL="https://demo.guru99.com/v3/index.php";
	public String username="mngr417160";
	public String password="gamazYg";
	public static WebDriver driver;
	
	
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.get(baseURL);
	
		
	}
	
	

	public void tearDown()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.quit();
	}
	

}
