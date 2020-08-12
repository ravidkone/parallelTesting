package com.parallel.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public static WebDriver driverWeb;
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser) throws InterruptedException {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driverWeb=new ChromeDriver();
			driverWeb.manage().window().maximize();
			driverWeb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("chrome browser launched");

		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driverWeb=new FirefoxDriver();
			driverWeb.manage().window().maximize();
			driverWeb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("firefox browser launched");

		}
		Thread.sleep(2000);
		driverWeb.get("https://www.google.com");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(" browser closed");
		driverWeb.quit();
		
	}
	
}
