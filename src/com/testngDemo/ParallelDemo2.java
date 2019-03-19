package com.testngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelDemo2 {

	WebDriver driver ;
	@Test 
	public void test1(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		System.out.println("page url : " + driver.getCurrentUrl());

	}
	
	@Test 
	public void test2(){
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		//driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		System.out.println("page url : " + driver.getCurrentUrl());

	}
	
	@Test 
	public void test3(){
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		//driver.get("https://www.facebook.com/");
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		System.out.println("page url : " + driver.getCurrentUrl());

	}
	
}
