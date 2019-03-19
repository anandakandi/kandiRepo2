package com.kumar;


 
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Kandi4 {
	public static void main(String[] args) throws InterruptedException {
	
		// chrome driver accesing from the project folder insted of from C drive
		
		System.setProperty("webdriver.chrome.driver",
				".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implisit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//String URL = "https://www.blackducksoftware.com/black-duck-home";
		String url = "https://www.flipkart.com/";
		driver.get(url);
		// to maximize window
		driver.manage().window().maximize();

//		driver.get("https://www.facebook.com/"
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		System.out.println("page url : " + driver.getCurrentUrl());
		
		// use Actions class to use key bord keys
		Actions keybord = new Actions(driver);
		keybord.sendKeys(Keys.ESCAPE);
		keybord.perform();
		
		
		// using mouseHover on web element 
		WebElement electronicsLnq = driver.findElement(By.xpath("//li/span[contains(text(),'electronics')]"));
		
		Action mouseHovronEvent = keybord.moveToElement(electronicsLnq).build();
		mouseHovronEvent.perform();
		
		

	/*	// select the radio butn and verify
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
*/
		 

		
	
		
		Thread.sleep(5000);
		// close the browser
		driver.close();
	}

}
