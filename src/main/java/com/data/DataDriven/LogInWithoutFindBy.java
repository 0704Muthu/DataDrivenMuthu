package com.data.DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.dynamic.TypeResolutionStrategy.Passive;


public class LogInWithoutFindBy {

	public static WebElement username;
	public static WebElement password;
	public static WebElement login;

	
	@DataProvider(name="logindata")
	private String[][] loginData() {
		String [][] data= {
				{"Mutu@123","King"},
				{"Muthu@123","King"},
				{"Mu@123","King"},
				{"uhtu@123","King"}

		};
		return data;
	}

	@Test(dataProvider = "logindata")
	private void browserLaunch(String user,String passw) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kutty\\eclipse-workspace\\jeeva\\DataDriven\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		PageFactory.initElements(driver, LogInWithoutFindBy.class);
		username.sendKeys(user);
		password.sendKeys(passw);
		login.click();
		driver.quit();
	}
}
