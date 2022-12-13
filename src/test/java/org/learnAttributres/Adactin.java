package org.learnAttributres;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Adactin {
//	@Test(groups = {"smoke"})
//	public void signUp() {
//		System.out.println("signUp");
//	}
//	@Test(groups = {"sanity"})
//	public void login() {
//		System.out.println("login");
//		//throw new NoSuchElementException();
//	}
//	@Test(groups = {"regression"})
//	public void searchProduct() {
//		System.out.println("searchProduct");
//
//	}
//	@Test(groups = {"smoke"})
//	public void addToCart() {
//		System.out.println("addToCart");
//		//throw new RuntimeException();
//	}
//	@Test(groups = {"regression"})
//	public void signOut() {
//		System.out.println("signOut");
//	}
	@Test(dataProvider = "login",dataProviderClass = Login.class)
	public void loginModule(String email,String password) {

		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.quit();


}
}
