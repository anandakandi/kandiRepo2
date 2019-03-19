package com.test.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
public static void main(String[] args) throws IOException {
	Properties obj = new Properties();
	FileInputStream fis = new FileInputStream("configDemo.properties");
	obj.load(fis);
	
	System.out.println(obj.getProperty("emp1"));
	System.out.println(obj.getProperty("emp2"));
	System.out.println(obj.getProperty("browser"));
}
}
