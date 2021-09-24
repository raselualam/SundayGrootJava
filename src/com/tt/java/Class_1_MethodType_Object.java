package com.tt.java;

public class Class_1_MethodType_Object {

	/* 	Types of Methods
	  	1.Void Method
	   	2.Static Method
	   	3.Return Type Method   */
	
	static int hourlyIncome = 75; //Manual QA = 40-60$, Automation QA = 50-70$, SDET =60-80$
	
	public static void main(String[] args) {
		//Void Method
		Class_1_MethodType_Object myobj = new Class_1_MethodType_Object();		//Create Class Object
		myobj.annualIncomeVoid();												//Calling Void Method
		
		//Static Method
		weeklyIncomeStatic();													//Calling Static Method

		//Return Type Method
		System.out.println("My Monthly Income = " + myobj.monthlyIncomeReturn()); //Calling Return Type Method using object

	}

	//Void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	//Static Method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	
	//Return Type Method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	public static String name(){
		String name = "Rayhan";
		return name;
	}

//Test Git
}
