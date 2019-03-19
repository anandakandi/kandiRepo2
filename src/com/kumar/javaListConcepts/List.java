package com.kumar.javaListConcepts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class List {

	public static void main(String[] args) {
	 
		double[] myAray = {5,7,3,8,2};
		double xyz = 300;
		System.out.println(xyz);
		System.out.println(Arrays.toString(myAray));
		// using for loop
		
		/*
		System.out.println(myAray.length);
		for (int i = 0; i < myAray.length; i++) {
			
			System.out.println(myAray[i]);
			
			
		}*/
		
		// using forEach loop
		for(double element : myAray){
			System.out.println(element);
						
		}
		
		// about array list**********
		
		ArrayList<String> list1= new ArrayList<>();
		list1.add("ANAND : " );
		list1.add("Sasi");
		System.out.println(list1);
		
		
		
		// about using MAP

		HashMap<Integer,Integer> hmap = new HashMap<>();

		HashMap< String, String> mps = new HashMap<>();
		//mps.put("fs", "fsd");
		hmap.put(1, 300);
		System.out.println(hmap);
		
		
		}
	
}
