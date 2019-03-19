package com.kumar.javaOverRidings;

public class ConstructorsTest {
	public ConstructorsTest() {
		// TODO Auto-generated constructor stub
		System.out.println("this is default constructor ");
	}
	
	public ConstructorsTest(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("this is default constructor "  + i);
	}


	public void m1(){
		System.out.println("this is  method  ");
	}
	
	String fruit ;
	public String  m1(String apple){
		this.fruit= apple;
		System.out.println("this is  method  "+fruit );

		return fruit;
	}

	
	public void m1(int i ){
		System.out.println("this is  method :  " + i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ConstructorsTest();
		new ConstructorsTest(6);
		ConstructorsTest obj = new ConstructorsTest();
		
		obj.m1();
        obj.m1(5);
        obj.m1("mango");
	}

}
