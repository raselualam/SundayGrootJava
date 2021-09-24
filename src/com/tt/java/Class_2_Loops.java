package com.tt.java;

public class Class_2_Loops {
	
	/* Type of Loops
	  	1. For Loop
	  	2. While Loop
	  	3. Do While Loop
	  	4. Infinite Loop
	 */

	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
//		practiceInfiniteLoop();
		practiceNestedForLoops();
	}
	
	public static void practiceForLoop(){					//For Loop - Do again and again upto upper limit
		int i;												//Initialize variables
		for (i=1; i<10; i++){ 								//Setting Lower limit, Upper limit, Increment or Decrement
			System.out.println("For Loops Numbers = " + i);	//Actions Do
		}
	}
	
	public static void practiceWhileLoop(){						//While Loop - do again and again upto condition get filled
		int i=1;												//Initialize variables, Setting starting point of condition
		while (i < 10){											//Setting condition
			System.out.println("While loops Numbers = " + i);	//Actions Do
			i++;												//Increment or Decrement
		}
	}
	
	public static void practiceDoWhileLoop(){						//Do While Loop - do action first then match the condition
		int i=1;													//Initialize variables, Setting starting point of condition
		do {
			System.out.println("Do While loops Numbers = " + i);	//Actions Do
			i++;													//Increment or Decrement
		} while (i<10);												//Checking Condition
	}
	
	public static void practiceInfiniteLoop(){						//Infinite Loop - Loops which never ends
		int i;														//Initialize variables
		for(i=1; ;i++){												//Setting No upper limit
			System.out.println("Infinite loops Numbers = " + i);	//Actions Do
		}
	}
	
	public static void practiceNestedForLoops(){				//Nested Loop - Loop inside another loop
		int i;													//Initialize variables i
		int j;													//Initialize variables j
		for (i=1;i<=10;i++){									//First Loop for 1
			for (j=1;j<=10;j++){								//Second Loop for J
				int multipicationTable= i*j;					//Actions Do 1
				System.out.print(multipicationTable + " ");		//Actions Do 1
			}
			System.out.println(" ");							//Actions Do 2
		}
	}
}
