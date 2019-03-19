package com.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver driver;
	public String browser;
	// declaring java Utils properties to get values from properties file
	public Properties config;

	// adding a constructor to initiate webBrowser
	public BaseTest() throws IOException {
		config = new Properties();
		// declaring the propertiesfile name
		String propfilename = ".//config.properties";
		// using input stream to access the values from the properties file
		InputStream stream = getClass().getClassLoader().getResourceAsStream(propfilename);
		// loading the properties file
		config.load(stream);
		browser = config.getProperty("browser");

	}

	@BeforeSuite
	public void setUp() throws InterruptedException {

	/*	if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
			// System.setProperty("webdriver.firefox.marionette",
			// ".//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(5000);
		}*/
		// switch case implimentation

		switch (browser) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
			// System.setProperty("webdriver.firefox.marionette",
			// ".//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(5000);
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			break;
		case "ie":
			System.out.println("no browser");
			break;

		default:
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			break;
		}
	}

	@AfterSuite
	public void close() {
		driver.close();
	}

}
