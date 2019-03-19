package com.kumar.javaConcepts;
// creating multiple methods with same name
public class sample8 {

	public void add(){
		System.out.println("this is simple add method ");
	}
	public void add(int a , int b){
		int addnumbers = a*b;
		System.out.println(addnumbers + "this is addition of second method ");
	}
	public void add(int a , double b){
		double  addnumbers2 = a+b ;
		System.out.println(addnumbers2 + "this adding of third method");
	}
}
