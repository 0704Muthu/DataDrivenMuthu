package com.data.DataDriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LaunchBrowser {

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test()

	public void propertyFile() throws IOException {
		WebDriver driver;
		FileReader fr = new FileReader("config.properties");
		Properties properties = new Properties();
		properties.load(fr);

		String browser=properties.getProperty("BrowserLocation");
		String url=	properties.getProperty("URL");
		String username=	properties.getProperty("Username");
		String password=	properties.getProperty("Password");

		System.setProperty("webdriver.chrome.driver",browser);
		driver = new ChromeDriver();// up casting
		driver.get(url);		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		


		
	}

}
