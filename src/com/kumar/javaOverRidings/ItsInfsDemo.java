package com.kumar.javaOverRidings;

public class ItsInfsDemo implements ItsIntFace , ItsIntfs2 {

	@Override
	public void Shape() {
		// TODO Auto-generated method stub
		System.out.println("this is  method from ItsFace");
		
	}

	@Override
	public Void dimentions(int i, double d) {
		System.out.println(i + " : " + d + " =>  this is from interface 2 " );
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		
		ItsInfsDemo obj = new ItsInfsDemo();
		 obj.dimentions(5, 6.6);
		 obj.Shape();
	}


}