package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.common.BaseTest;
import com.common.GeneralFunc;
import com.test.pages.FB_TestPage;

public class FB_Test extends GeneralFunc {
	String sheetName = "test";
	
	//WebDriver driver;
	 public FB_Test() throws IOException {
		// TODO Auto-generated constructor stub
		 super();
	}
	
	 @Test(testName ="verify test1", description = "this is verifying tset1 scenario")
	 public void sinario1() throws IOException, InterruptedException{
		 FB_TestPage pp = new FB_TestPage();
		 
		System.out.println( pp.getExcelValues(sheetName, "EMP_NAME", 1));
		 
		System.out.println( pp.getExcelValues(sheetName, "ATTENDANCE_DATE", 1));
		 
		 System.out.println(pp.getExcelValues(sheetName, "TIME_ON_FLOOR", 1));
		 
		 
		 pp.verifyHomePageTitle();
		 pp.verfyRadioBtn();
		 pp.verfyFG_PwdLinkText();
	 }
	 @Test(enabled = false)
	 public void sinario4Anand() throws IOException{
		 FB_TestPage pp= new FB_TestPage();
		 pp.image();
		 
	 }
	 
	 @Test(enabled = false)
	 public void sinario2() throws IOException, InterruptedException{
		 FB_TestPage pp = new FB_TestPage();
		 pp.verifyHomePageTitle();
		 pp.selectdate();
		 pp.verfyFG_PwdLinkText();
		 
	 }
	@Test (enabled = false)
	public void mytest() throws InterruptedException{
	
	String title = driver.getTitle();
	System.out.println("page title : " + title);
	System.out.println("page url : " + driver.getCurrentUrl());

	// select the radio butn and verify
	WebElement element = driver.findElement(By.xpath("//input[@value='1']"));
	if (element.isSelected()) {
		System.out.println("radio btn is already selected  : ");

	} else {
		System.out.println("radio btn not selected");
		element.click();
	}
	
	}
	@Test (enabled = false)
	public void mytest2() throws InterruptedException{

	// select the listbox

	Select selectDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
	selectDay.selectByVisibleText("12");
	selectDay.selectByIndex(3);
	selectDay.selectByValue("5");
	// similarly for month and year
	

	// navigation command
	WebElement linqtextURL = driver.findElement(By.linkText("Forgotten account?"));
	linqtextURL.click();
	System.out.println("nextpage title  :  " + driver.getTitle());
	driver.navigate().back();
	System.out.println("previous page title  :  " + driver.getTitle());
	driver.navigate().forward();
	System.out.println("forword page title  :  " + driver.getTitle());
	driver.navigate().refresh(); 

	Thread.sleep(5000);
	
	//explisit wait
	
	WebDriverWait  signupwait = new WebDriverWait(driver, 15);
	signupwait.until(ExpectedConditions.elementToBeClickable(By.name("websubmit")));
	WebElement element1 = driver.findElement(By.name("websubmit"));
	signupwait.until(ExpectedConditions.visibilityOf(element1));
	
	element1.click();
	
	driver.findElements(By.tagName("select")).size();
	
	
	// close the browser
	//driver.close();
}

}
