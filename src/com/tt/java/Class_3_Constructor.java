package com.tt.java;

public class Class_3_Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	 	- 	Constructor cannot be static or override nor void or return type.
	 	- 	Default Constructor
	 	- 	Parameterized Constructor
	 	-	Constructor overloading
	 */
	
	int a,b,c,g,h,j,k,l,m;

	
	public Class_3_Constructor(int x){
		g=x;
	}
	
	public Class_3_Constructor(int x, int y){
		h=x;
		j=y;
	}
	
	public Class_3_Constructor(int x, int y, int z){
		k=x;
		l=y;
		m=z;
	}
	

	public static void main(String[] args) {
		Class_3_Constructor myObj = new Class_3_Constructor(12, 15, 21);
		myObj.simpleMethod(10);
		Class_3_Constructor myObj2  = new Class_3_Constructor(12, 15);
		myObj2.simpleMethod(10);

	}
	

	public void simpleMethod(int p){
		p=a;
		System.out.println("Parameterized method variable value : " + p);
	}
}
