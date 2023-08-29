package com.bptn.course.week1;

public class VariableOperation {

	public static void main(String[] args) {
		
		int x = 7; //  Original int variables 
	     int y = 1; //  Original int variables 
	     int z = x + y;
	     System.out.println("x+y"); //  Different math operations
	     System.out.println(z);
	     
	     int a = 5;
	     int b = 8;
	     int d = a - b;
	     System.out.println("a-b"); //  Different math operations
	     System.out.println(d);
	     
	     int p = 2;
	     int r = 4;
	     int e = p * r;
	     System.out.println("p*r"); //  Different math operations
	     System.out.println(e);
	     
	  // Reassign the value of x = 10 and y = 20
	     x = 20;
	     y = 10;
	     z = x + y;
	     System.out.println("x+y");
	     System.out.println(z);
	     
	  // Declaring variables with different data types
	     String food = "Rice";
	     String name = "Akhere";
	     System.out.println( name + "'s favourite food is " + food);
	     
	     int examScore = 80;
	     char grade = 'A';
	     if (examScore >= 80) {
	    
	     } else {
	       grade = 'F';
	     }
	     System.out.println("Then your grade is " + grade);
	     
	    
	     
	   
	}

}
