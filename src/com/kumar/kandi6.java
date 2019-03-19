package com.kumar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// print all linqs in a web page 
public class kandi6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> linqs= driver.findElements(By.tagName("a"));
		System.out.println("number of linqs =   " + linqs.size() );
		for (int i=1; i<linqs.size(); i++ ) {
			String linqtext = linqs.get(i).getText();
			String linqUrl = linqs.get(i).getAttribute("href");
			System.out.println("text  :"  + linqtext  + "url  :"  +  linqUrl);
			
			
		}
		// similarly for inputboxes
		
		
		
		
	}

}
