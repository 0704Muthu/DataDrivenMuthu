package org.learnAttributres;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Login {
	@DataProvider(name ="login")
	private String[][] getData() {
		String[][] data = new String[2][2];
		data[0][0]="MuthuKumar@gmail.com";
		data[0][1]="Muthu@123";

		data[1][0]="Muthu@gmail.com";
		data[1][1]="M@123";

		return data;
	}


	@Test(dataProvider = "login")
	public void loginModule(String email,String password) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kutty\\eclipse-workspace\\jeeva\\Selenium_Batch_9AM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertEquals(true, true);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		Assert.assertEquals(true, true);
		driver.quit();



	}
}
