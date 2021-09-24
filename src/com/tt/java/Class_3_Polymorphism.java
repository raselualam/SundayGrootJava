package com.tt.java;

public class Class_3_Polymorphism extends Van{
	
	/* Polymorphism is the ability of an object to take on many forms.
 	 		- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
 	 		- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
	 */
	
	//Method overloading
	
	Class_3_Polymorphism() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void car(){
		System.out.println("My car is BMW");
	}
	
	public void car(int door){
		System.out.println("My car is BMW, Door int = " + door);
	}
	
	public void car(String Color){
		System.out.println("My car is BMW, Color string = " + Color);
	}
	
	public void car(int door, int seat){
		System.out.println("My car is BMW, Door int = " + door + " Seat = " + seat);
	}
	
	public static void main(String[] args) {
		
		Class_3_Polymorphism obj = new Class_3_Polymorphism();
		
		//Method overloading
		obj.car(2);
		obj.car();
		obj.car("Black");
		obj.car(4,5);
		
		//Method overriding
		
		obj.vanFord();

	}
	
	public void vanFord(){
		System.out.println("this is from method overriding");
	}
}

class Van {
	
	public void vanFord(){
		System.out.println("This is vanFord method from van class");
	}
}