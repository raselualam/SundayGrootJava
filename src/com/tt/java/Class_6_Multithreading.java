package com.tt.java;

public class Class_6_Multithreading {
	
	/* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 
		2. Implementing the Runnable Interface */
}

//1. Java code for thread creation by extending

	//the Thread class
	class MultithreadingDemo extends Thread {
	 public void run()
	 {
	     try {
	         // Displaying the thread that is running
	         System.out.println(
	             "Thread " + Thread.currentThread().getId()
	             + " is running");
	     }
	     catch (Exception e) {
	         // Throwing an exception
	         System.out.println("Exception is caught");
	     }
	 }
	}
	
	//Main Class
	public class Multithread {
	 public static void main(String[] args)
	 {
	     int n = 8; // Number of threads
	     for (int i = 0; i < n; i++) {
	         MultithreadingDemo object
	             = new MultithreadingDemo();
	         object.start();
	     }
	 }
	}
	
// 2. Java code for thread creation by implementing
	// the Runnable Interface
	class MultithreadingDemo2 implements Runnable {
	    public void run()
	    {
	        try {
	            // Displaying the thread that is running
	            System.out.println(
	                "Thread " + Thread.currentThread().getId()
	                + " is running");
	        }
	        catch (Exception e) {
	            // Throwing an exception
	            System.out.println("Exception is caught");
	        }
	    }
	}
	 
	// Main Class
	class Multithread2 {
	    public static void main(String[] args)
	    {
	        int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	            Thread object
	                = new Thread(new MultithreadingDemo());
	            object.start();
	        }
	    }
	}
