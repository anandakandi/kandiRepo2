package com.test.pages;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.common.BaseTest;
import com.common.GeneralFunc;

public class FB_TestPage extends GeneralFunc implements FB_TestPages{
	public FB_TestPage() throws IOException {
		super();
	}

	@Test
	public void test() throws InterruptedException{
		verifyHomePageTitle();
		 verfyRadioBtn();
	}

	// varify radio btn
	public void verfyRadioBtn() {
		WebElement element = driver.findElement(By.xpath(radiobtn));
		// WebElement element = driver.findElement(By.xpath(radiobtn));
		element.isDisplayed();
	}

	// select radiobtn
	public void selectRadioBtn() {
		verfyRadioBtn();
		WebElement element = driver.findElement(By.xpath(radiobtn));
		if (element.isSelected()) {
			System.out.println("radio btn is already selected  : ");

		} else {
			System.out.println("radio btn not selected");
			element.click();

		}
	}

	// verify page title
	public void verifyHomePageTitle() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		String pg_Title = driver.getTitle();
		Assert.assertEquals(pg_Title, "Facebook – log in or sign up", "pageTitle dosnot match");

	}

	// verify forgot password linq url

	public void verfyFG_PwdLinkText() {
		WebElement forgotPaswrdLink = driver.findElement(By.linkText(forgotPwdLinkTxt));

		forgotPaswrdLink.isDisplayed();
		String F_PwdLinkText = forgotPaswrdLink.getText();
		Assert.assertEquals(F_PwdLinkText, "Forgotten account?");

	}
	String imageLinkTry="//img[@title='Kantesh Ks']";
	// select an image
	public void image() throws IOException{
		WebElement imageLink=driver.findElement(By.xpath(imageLinkTry));
		String Imagestr=imageLink.getAttribute("src");
	//	URL imgurl= new URL(Imagestr);
		//BufferedImage saveimg= ImageIO.read(imgurl);
		// ImageIO.write(saveImage, "png", new File("logo-image.png"));
//ImageIO.write(saveimg, formatName, output)
		System.out.println(Imagestr);
		imageLink.isDisplayed();
		
	}

	// selecting day for dob

	public void selectdate() {
		WebElement select_day = driver.findElement(By.xpath(day));
		select_day.isDisplayed();
		Select selectDay = new Select(select_day);
		selectDay.selectByValue("5");
	}
}
