package com.tt.java;

import java.util.Arrays;
import java.util.HashMap;

public class Class_4_Array_Hashmap {

	public static void main(String[] args) {
		
		// Array store multipul data using index

		int age = 30;
		
		int[] ageGroupA = new int[]{25, 35, 32, 38, 40, 50};
		
		//Array Index				0	1	2	3	4	5							
		
		System.out.println("Group A student age = " + ageGroupA[11]);
			
		System.out.println("Array Length of ageGroupA = " + ageGroupA.length); //Array Length
		
		String name = "Sadia";
		
		boolean[] boolArray = {true, false, false, false, true, true};
		System.out.println("Boolean arrary print result = " + boolArray[4]);
		System.out.println("Boolean arrary print result = " + Arrays.toString(boolArray));
		
		String[] nameGroupA = new String[]{"David", "Akon", "Sarwar", "Shahid", "Afsana", "Sadia"};
		
		//Array Index							0		1		2		  3			4		5							
		
		System.out.println("Group A student name = " + nameGroupA[4]);
		
		//Multi-dimensional Array
		
		int[][] D = {
				{25, 35, 32, 38, 40, 50},	//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
				{32, 24, 12, 6}};			//[1][0] [1][1] [1][2] [1][3]
		
		System.out.println("Multi-dimensional Array : " + D[0][2]);
		
		//Print Array
		
		for (int i = 0; i < D.length; i++){
			for (int j = 0; j < D[i].length; j++){
				System.out.println("Multi-dimensional Array all value: " + D[i][j]);
			}
		}
		
		//Hashmap store multipul data using key-value pair.
		
		HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
		
		StudentAge.put("David", 28);
		StudentAge.put("Akon", 27);
		
		System.out.println("Hashmap value : " + StudentAge.get("Akon"));
		
		HashMap<String, String> CapitalCity = new HashMap<String, String>();
		
		CapitalCity.put("USA", "Washington DC");
		CapitalCity.put("Bangladesh", "Dhaka");
		CapitalCity.put("India", "New Delhi");
		CapitalCity.put("Chaina", "Beijing");
		
		System.out.println("Hashmap capital : " + CapitalCity.get("India"));
	}

}
