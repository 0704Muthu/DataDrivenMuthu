package com.runnerclass;




import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features =
"src\\test\\java\\com\\feature\\OpenGoogle.feature"
,glue="com.stepdefinition")
public class TestRunner   {

	
	


}
