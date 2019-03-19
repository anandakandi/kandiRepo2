package com.Dataprovider.demo;

import org.testng.annotations.DataProvider;

public class TestDp1 {
	@DataProvider(name="searchProvider")
	public static Object[][] getvalues(){
		return new Object[][]{
			{"anand","kandi"},{"rajkumar","kandi"},{"sandhya","kandi"},{"yuvan","kandi"},
			{"ananya","kandi"}
		};
	}

}
