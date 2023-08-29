package com.bptn.course.week1;
		import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/...............Calculator Menu................/");
//        System.out.println("Press 1 for addition");
//        System.out.println("Press 2 for subtraction");
//        System.out.println("Press 3 for multiplication");
//        System.out.println("Press 4 for division");
//        System.out.println("Press 5 to square a number");
//        System.out.println("Press 6 to find a square root");
//        System.out.println("Press 7 to find the reciprocal");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
      
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        double result = 0;

      
        if (choice >= 1 && choice <= 4) {
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            if (choice == 1) {
                result = num1 + num2;
            } else if (choice == 2) {
                result = num1 - num2;
            } else if (choice == 3) {
                result = num1 * num2;
                System.out.println("The product of the number is");
            } else if (choice == 4) {
                if (num2 != 0) {
                    result = num1 / num2;
                    double dividend = 50.0;
                    double divisor = 25.0;

                    double quotient = dividend / divisor;
                    double remainder = dividend % divisor;

                    if (remainder == 0) {
                        System.out.println("Dividing " + dividend + " by " + divisor + " the quotient is " + quotient);
                        System.out.println("The remainder is " + remainder);
                    } else {
                        System.out.println("Dividing " + dividend + " by " + divisor + " the quotient is " + quotient);
                        System.out.println("The remainder is " + remainder);
                        
                    }                     
    
                    
                } else {
                    System.out.println("Cannot divide by zero");
                    System.exit(0);
                }
            }
        } else if (choice == 5) {
            result = num1 * num1;
            System.out.println("The square of the number is");
            
        } else if (choice == 6) {
            if (num1 >= 0) {
                result = Math.sqrt(num1);
            } else {
                System.out.println("Cannot find square root of a negative number");
                System.exit(0);
            }
        } else if (choice == 7) {
            if (num1 != 0) {
                result = 1 / num1;
                System.out.println("The reciprocal of the number is");
            } else {
                System.out.println("Cannot find reciprocal of zero");
                System.exit(0);
            }
        } else {
        	 
            System.out.println("Invalid choice!");
            System.exit(0);
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}