package com.kumar.javaConcepts;

public class Sample4 extends Sample3{
	
	public static void main(String[] args) {
		System.out.println();
	Sample4 ss = new Sample4();
	ss.add(5, 6);
	//	add(5,6);
		
		ss.honk();
		// calling static method
		doll();
		mul();
	}
		 public void add(int a , int b ){
			int addition = a+b ;
			System.out.println(addition);
			 
		 }
	 
		 public static void mul(){
			 System.out.println("this is static method in the same class");
		 }
	
	 
	 

}
