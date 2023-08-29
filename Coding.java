package com.bptn.course.week1;

import java.util.Scanner;

public class Coding {
    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String concatenateStrings(String s1, String s2) {
        return s1 + s2;
    }

    public static String compareStrings(String s1, String s2) {
        if (s1.equals(s2)) {
            return "Strings are equal";
        } else {
            return "Strings are not equal";
        }
    }

    public static int calculateStringLength(String s) {
        return s.length();
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("/................String Menu................/");
//            System.out.println("Press 1 for Palindrome Check");
//            System.out.println("Press 2 to reverse a String");
//            System.out.println("Press 3 to Concatenate two Strings");
//            System.out.println("Press 4 for String Comparison");
//            System.out.println("Press 5 to Calculate the Length of String");
//            System.out.println("Press 6 to Exit");

            System.out.print("Enter your string: ");
         
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String inputString = scanner.nextLine();
                    if (isPalindrome(inputString)) {
                        System.out.println("It's a palindrome!");
                    } else {
                        System.out.println("It's not a palindrome.");
                    }
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    String inputString2 = scanner.nextLine();
                    String reversedString = reverseString(inputString2);
                    System.out.println("Reversed string: " + reversedString);
                    break;
                case 3:
                    System.out.print("Enter the first string: ");
                    String string1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String string2 = scanner.nextLine();
                    String concatenatedString = concatenateStrings(string1, string2);
                    System.out.println("Concatenated string: " + concatenatedString);
                    break;
                case 4:
                    System.out.print("Enter the first string: ");
                    String string3 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String string4 = scanner.nextLine();
                    String comparisonResult = compareStrings(string3, string4);
                    System.out.println(comparisonResult);
                    break;
                case 5:
                    System.out.print("Enter a string: ");
                    String inputString5 = scanner.nextLine();
                    int length = calculateStringLength(inputString5);
                    System.out.println("Length of string: " + length);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
	

	



