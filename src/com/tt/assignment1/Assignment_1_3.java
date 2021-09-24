package com.tt.assignment1;

public class Assignment_1_3 {

	/*Problem 03: A function which returns the multiply value of a and b where a = 9 and b = 11.
	Write a program which will display addition of a + b + function returns value. */


		public static void main(String[] args) {

			int a=2;
			
			int b=3;
			
			int multiplicationValue = multiplyFunction(a,b);
			
			System.out.println("The Result is : " + (a+b+multiplicationValue));
		}
		
		public static int multiplyFunction(int a, int b){
			return a*b; 
		}
	
}
