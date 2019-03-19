package mm.k;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class K3 {
	
	@BeforeSuite
	public void testingBColorsinSuite(){
		System.out.println("this is before suite");
	}
	
	@AfterSuite
	public void testingAColorsinSuite(){
		System.out.println("this is after suite");
	}
	@BeforeTest
	public void testingBColorsinTest(){
		System.out.println("this is before test");
	}
	
	@AfterTest
	public void testingAColorsinTest(){
		System.out.println("this is after test");
	}
	
	@BeforeClass
	public void testingBColorsinClass(){
		System.out.println("this is before class");
	}
	
	@AfterClass
	public void testingAColorsinClass(){
		System.out.println("this is after class");
	}
	
	@BeforeMethod
	public void testingBColors(){
		System.out.println("this is before method");
	}
	
	@AfterMethod
	public void testingAColors(){
		System.out.println("this is after method");
	}
	
	@Test ( priority = 3,groups={"anand"})
	public void colorsBlue(){
		System.out.println("given priorty to Blue : ");
	}
	@Test ( priority = 2,groups={"kumar"}) 
	public void colorsYellow(){
		System.out.println("given priorty to Yellow : ");
	}
	@Test ( priority = 4,groups={"anand"})
	public void colorsBlack(){
		System.out.println("given priorty to Black : ");
	}
	@Test ( priority = 1,groups={"kumar"})
	public void colorsGreen(){
		System.out.println("given priorty to Green : ");
	}
	@Test ( priority = 5)
	public void colorsWhite(){
		System.out.println("given priorty to White : ");
	}
}
