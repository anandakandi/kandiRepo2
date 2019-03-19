package com.kumar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class kandi8 {
// working on frames
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement loginLinqs = driver.findElement(By.xpath("//*[contains(text(),'Log In')]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(loginLinqs));
		if(loginLinqs.isDisplayed()){
			loginLinqs.click();
		} else{
			System.out.println("loginLinqa is not awilable");
			
		}
			driver.switchTo().frame(0);
			
		String listItems = "//p[contains(text(),'Benefits of Paytm Account')]/..//li"  ;
		List<WebElement> list1 = driver.findElements(By.xpath(listItems));
		System.out.println("Number od=f lists  : " + list1.size());
		for (int i = 1; i < list1.size(); i++) {
			String itemText =list1.get(i).getText();
			System.out.println(itemText);
			}
		// close the iFrame
		driver.switchTo().defaultContent();
		String iframe_CloseBtn = "//a[@title='Close']";
		WebElement iframeClose = driver.findElement(By.xpath(iframe_CloseBtn));
		iframeClose.click();
		
		if(loginLinqs.isDisplayed());
		driver.close();
		
		
	}

}
