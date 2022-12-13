package com.data.DataDriven;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactoryWithAnnoataion {

	@FindBy(how = How.ID,using = "username")
	public static WebElement username;
	@FindBy(id="password")
	public static WebElement password;
	@FindBy(id="re_password")
	public static WebElement  confirmPassword;
	@FindBy(id="full_name")
	public static WebElement fullName;
	@FindBy(id="email_add")
	public static WebElement emailAddress;
	@FindBy(id="tnc_box")
	public static WebElement termsAndCondition;
	@FindBy(id="Submit")
	public static WebElement  register;
	
	
	
	
//	public static  WebElement userName(WebDriver driver) {
//		return driver.findElement(By.id("username"));
//	}
//	public static WebElement password(WebDriver driver) {
//		return driver.findElement(By.id("password"));
//	}
//	
//	public static WebElement confirmPassword(WebDriver driver) {
//		return driver.findElement(By.id("re_password"));
//	}
//	
//	public static WebElement fullName(WebDriver driver) {
//		return driver.findElement(By.id("full_name"));
//	}
//	
//	public static WebElement emailAddress(WebDriver driver) {
//		return driver.findElement(By.id("email_add"));
//	}
//	
	public static void captchaText(WebDriver driver) {
		Scanner ref = new Scanner(System.in);
		 String next2 = ref.next();
		 driver.findElement(By.id("captcha-form")).sendKeys(next2);;
	}
//	public static WebElement termsAndCondition(WebDriver driver) {
//		return driver.findElement(By.id("tnc_box"));
//	}
//	
//	public static WebElement register(WebDriver driver) {
//		return driver.findElement(By.id("Submit"));
//	}
}
