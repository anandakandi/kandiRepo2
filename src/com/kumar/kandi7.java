package com.kumar;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kandi7 {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver",
			".\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// implisit wait
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//String URL = "https://www.blackducksoftware.com/black-duck-home";
	String url = "https://brands.flipkart.com/";
	 driver.get(url);
	 WebElement scrollFooterLinqs = driver.findElement(By.xpath("//footer"));
	 JavascriptExecutor js = (JavascriptExecutor) driver;  
	   js.executeScript("arguments[0].scrollIntoView",scrollFooterLinqs);
	  List<WebElement> linqscrollForfooter = driver.findElements(By.xpath("//ul[@class = 'socialicons']/li"));
	int linqSize=  linqscrollForfooter.size();
	System.out.println("number of linqs  : " + linqSize );
	for (int i=0 ; i<linqSize ; i++ ){
//		get the url to l_url
		String l_url=linqscrollForfooter.get(i).getAttribute("href");
		System.out.println(l_url);
		String parent=driver.getWindowHandle();
		System.out.println("parent id  :"  +  parent);
		linqscrollForfooter.get(i).click();
		driver.switchTo().window(parent);
		
		}
	// it will click on first linq...then a new windo will be opend so to handle that windo we use windoHandlers
			Set<String> s1= driver.getWindowHandles();
			for(String w : s1  ){
				driver.switchTo().window(w);
				String windotitle =driver.getTitle();
				System.out.println(windotitle);
				
			}
	  
	
	
	}

}
