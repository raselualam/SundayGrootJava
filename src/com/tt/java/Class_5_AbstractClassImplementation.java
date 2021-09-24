package com.tt.java;

public class Class_5_AbstractClassImplementation extends Class_5_AbstractClass{

	//When we inherit (using extends keyword) an abstract class to a regular child class we have to implement abstract methods.

	public void iDoor(){
		int numDoor=4;
	}
	
	public int iWheels(){
		int numWheels =4;
		return numWheels;
	}
	
	public String iColor(){
		String color = "Black";
		return color;
	}

}
