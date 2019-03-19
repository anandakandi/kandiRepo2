package com.kumar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		System.out.println("page url : " + driver.getCurrentUrl());

		// selecting listbox by month
		Select selctMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		selctMonth.selectByVisibleText("Mar");
		selctMonth.selectByIndex(4);
		selctMonth.selectByValue("4");

		Thread.sleep(5000);
		// close the browser
		driver.close();
	}

}
