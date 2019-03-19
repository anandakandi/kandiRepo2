package com.kumar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Kandi3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implisit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String URL = "https://www.blackducksoftware.com/black-duck-home";
		driver.get(URL);

//		driver.get("https://www.facebook.com/"
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		System.out.println("page url : " + driver.getCurrentUrl());

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
		 

		
		//use findelements by list
		List<WebElement> navit=  driver.findElements(By.xpath("//nav[@id='navbar-collapse']/ul/li"));
		System.out.println(navit.size());
		driver.findElement(By.xpath("//nav[@id='navbar-collapse']/ul/li[3]")).getText();
//		System.out.println(driver.findElement(By.xpath("//nav[@id='navbar-collapse']/ul/li[3]")).getText());
		Thread.sleep(3000);
		
		
		
		for (int i=1;i<=navit.size(); i++){
		String linqs = 	driver.findElement(By.xpath("//nav[@id='navbar-collapse']/ul/li["+i+"]")).getText();
			System.out.println(linqs);
			
			
		}
		
		Thread.sleep(5000);
		// close the browser
		driver.close();
	}

}
