package com.kumar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kandi1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		System.out.println("page url : " + driver.getCurrentUrl());

		// print page headre text : h1
		String headertext = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("print header text : " + headertext);

		// print forgot password linq url
		String linqtextURL = driver.findElement(By.linkText("Forgotten account?")).getAttribute("href");
		System.out.println("by using linqText " + linqtextURL);

		// use partial linq text
		String prtialLinqtext = driver.findElement(By.partialLinkText("Create a ")).getAttribute("href");
		System.out.println("by using partial linqText" + prtialLinqtext);

		// enter user name
		// driver.findElement(By.id("email")).clear();
		// driver.findElement(By.id("email")).sendKeys("anandakandi3@gmail.com");
		String userEmail = "anandakandi3@gmail.com";
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.clear();
		emailId.sendKeys(userEmail);

		// butten exist or not
		WebElement loginbtn = driver.findElement(By.xpath("//input[@id='u_0_2']"));
		if (loginbtn.isDisplayed()) {
			System.out.println("login btn diplad");
			System.out.println("print login btn name :  " + loginbtn.getAttribute("value"));
		} else {
			System.out.println("no login btn");
		}
		// close the browser
		driver.close();
	}

}
