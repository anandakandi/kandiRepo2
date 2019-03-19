package com.kumar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kandi2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		System.out.println("page url : " + driver.getCurrentUrl());

		// select the radio butn and verify
		WebElement element = driver.findElement(By.xpath("//input[@value='1']"));
		if (element.isSelected()) {
			System.out.println("radio btn is already selected  : ");

		} else {
			System.out.println("radio btn not selected");
			element.click();
		}

		// select the listbox

		Select selectDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		selectDay.selectByVisibleText("12");
		selectDay.selectByIndex(3);
		selectDay.selectByValue("5");
		// similarly for month and year
		

		// navigation command
		WebElement linqtextURL = driver.findElement(By.linkText("Forgotten account?"));
		linqtextURL.click();
		System.out.println("nextpage title  :  " + driver.getTitle());
		driver.navigate().back();
		System.out.println("previous page title  :  " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("forword page title  :  " + driver.getTitle());
		driver.navigate().refresh(); 

		Thread.sleep(5000);
		
		//explisit wait
		
		WebDriverWait  signupwait = new WebDriverWait(driver, 15);
		signupwait.until(ExpectedConditions.elementToBeClickable(By.name("websubmit")));
		WebElement element1 = driver.findElement(By.name("websubmit"));
		signupwait.until(ExpectedConditions.visibilityOf(element1));
		
		element1.click();
		
		driver.findElements(By.tagName("select")).size();
		
		
		// close the browser
		driver.close();
	}

}
