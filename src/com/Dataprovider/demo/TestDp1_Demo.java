package com.Dataprovider.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDp1_Demo {
	WebDriver driver ;
//	@BeforeTest
//	public void setup(){
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\sys\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		// implisit wait
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		String URL = "https://www.google.com";
//		driver.get(URL);

	//}
	@Test(dataProvider="searchProvider" , dataProviderClass=TestDp1.class)
	public void test(String s1, String s2) throws InterruptedException{
		/*WebElement search = driver.findElement(By.name("q"));
		search.clear();
		search.sendKeys(s1+"  "+ s2);
		Thread.sleep(5000);*/
		System.out.println(s1+"  " + s2 );
	}
}
