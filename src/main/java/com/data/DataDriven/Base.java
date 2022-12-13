package com.data.DataDriven;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {
	
	public static WebDriver driver;
	
	
		

		public static WebDriver getBrowser(String launch) { //BrowserLaunch
			if (launch.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\kutty\\eclipse-workspace\\jeeva\\Selenium_Batch_11Am_Oct\\chromedriver\\chromedriver.exe");			
				driver = new ChromeDriver();
			}

			return driver; }

		public static void getURL(String link) { //getURL
			driver.get(link);
			driver.manage().window().maximize(); }	//maximize	

		public static void close() {  //close
			driver.close(); }

		public static void quit() {   //quit
			driver.quit();  }

		public static void inputvalues(WebElement element,String value) {//send keys
			element.sendKeys(value); }

		public static void clickonelement(WebElement element) {//click
			element.click(); 	}

		public static void waitexplicit(long value , WebElement value1) {//explicit wait
			WebDriverWait wait = new WebDriverWait(driver, value);
			wait.until(ExpectedConditions.visibilityOf(value1)); }

		public static void waitimplicit(long value) { //implicit wait
			driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);}

		public static void screenshot(String filename) throws IOException{ //takesscreenshot
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourcefile = ts.getScreenshotAs(OutputType.FILE);
			File destinationfile = new File("C:\\Users\\kutty\\eclipse-workspace\\Selenium\\screenshot\\img.png");
			FileHandler.copy(sourcefile, destinationfile); }

		public static void alertok() { //alert accept
			Alert a = driver.switchTo().alert();
			a.accept(); }

		public static void alertcancel() { //alert dismiss
			Alert a = driver.switchTo().alert();
			a.dismiss(); }

		public static void navigateRefresh() { //navigate refresh
			driver.navigate().refresh(); }

		public static void navigateto(String url) { //navigate to
			driver.navigate().to(url); }

		public static void navigateForward() {    //navigate forward
			driver.navigate().forward();  }

		public static void navigateBack() {  //navigate back
			driver.navigate().back();  }

		public static void moveto(WebElement element) {  //mouseaction_moveToElement
			Actions a = new Actions(driver);
			a.moveToElement(element).perform();  }

		public static void rightclick(WebElement element) {  //mouseaction_contextClick
			Actions a = new Actions(driver);
			a.contextClick(element).perform();  }

		public static void doubleclick(WebElement element) {//mouseaction_doubleClick
			Actions a = new Actions(driver);
			a.doubleClick(element).perform();	}

		public static void frameindex(int index) { //frames index
			driver.switchTo().frame(index);}

		public static void framestring(String value) {//frames string
			driver.switchTo().frame(value); }

		public static void parentFrame() { //frames parent
			driver.switchTo().parentFrame(); }

		public static boolean ismultiple(String value) {     //is multiple
			WebElement multiple = driver.findElement(By.xpath(value));
			Select s = new Select(multiple);
			return s.isMultiple(); }

		public static boolean isdisplayed(String value) { //isdisplayed
			WebElement d = driver.findElement(By.xpath(value));
			return d.isDisplayed();}

		public static boolean isenable(String value) { //isenable
			WebElement e = driver.findElement(By.xpath(value));
			return e.isEnabled();}

		public static boolean isselected(String value) { //isselected
			WebElement s = driver.findElement(By.xpath(value));
			return s.isSelected(); }

		public static void selectby(WebElement element , String type, int index , String values){//dropdown 
			if (type.equalsIgnoreCase("value")) {
				Select s = new Select(element);
				s.selectByValue(values);}
			else if (type.equalsIgnoreCase("index")) {
				Select s = new Select(element);
				s.selectByIndex(index);}
			else if (type.equalsIgnoreCase("visible text")) {
				Select s = new Select(element);
				s.selectByVisibleText(values);}
			else {
				System.out.println("Invalid type");}}

		public static void keyup() throws Throwable { //keyboardaction
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);}

		public static void keydown() throws Throwable {//keyboardaction
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN); }

		public static void keyenter() throws Throwable {//keyboardaction
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER); }

		public static void getoptions(WebElement element) { //get options
			Select s = new Select(element);
			java.util.List<WebElement> options = s.getOptions();
			for (WebElement get : options) {
				System.out.println(get.getText());}}

		public static void getfirstselectedoption(WebElement element) {//Get first selected options
			Select s = new Select(element);
			WebElement firstselect =  s.getFirstSelectedOption();

		}
		public static void getallselectedoptions() {//Get all selected options
		}


		public static void getTitle(String title) { //get title
			driver.getTitle(); }

		public static void getcurrenturl() { //get current url
			driver.getCurrentUrl(); }

		public static void gettext(WebElement element) { //get text
			String text = element.getText();
			System.out.println(text);    }

		public static void getattribute(WebElement element, String value) { //get attribute
			String attribute = element.getAttribute(value);
			System.out.println(attribute);    }
		public static void selectbyindex(WebElement element,int index ) {
			Select s = new Select(element);
			s.selectByIndex(index);
		}
		public static void selectbyvalue(WebElement element,String values ) {
			Select s = new Select(element);
			s.selectByValue(values);
		}
		public static void selectbyvisibletext(WebElement element,String values ) {
			Select s = new Select(element);
			s.selectByVisibleText(values);

		}

		
	}







