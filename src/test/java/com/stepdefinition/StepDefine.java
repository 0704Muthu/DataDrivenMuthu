package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine {

	public static WebDriver a ;
    public static String b="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjcwNzUxNjgwLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
	@Given("user navigates to Facebook")
	public void user_navigates_to_facebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kutty\\eclipse-workspace\\jeeva\\Java_Selenium_Freshers\\Driver\\chromedriver.exe");
		a = new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.facebook.com");
	}
	@When("I enter Username as {string} and Password as {string}")
	public void i_enter_username_as_and_password_as(String username, String password) {
		a.findElement(By.id("email")).sendKeys(username);
		a.findElement(By.id("pass")).sendKeys(password);
		a.findElement(By.name("login")).click();
	}
	@Then("login should be unsuccessful")
	public void login_should_be_unsuccessful(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("pass");
		//a.close(); 
	}

}
