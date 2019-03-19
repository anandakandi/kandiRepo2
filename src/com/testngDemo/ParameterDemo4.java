package com.testngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterDemo4 {

	WebDriver driver ;
	
	@Parameters("url") 
	@Test 
	
	public void test1(String url){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get(url);
		
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		System.out.println("page url : " + driver.getCurrentUrl());

	}
	@Parameters("url2")
	@Test 
	public void test2(String url2){
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		//driver.get("https://www.facebook.com/");
		driver.get(url2);
		
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		System.out.println("page url : " + driver.getCurrentUrl());

	}
	
	
}
