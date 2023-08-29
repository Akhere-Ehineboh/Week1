package com.bptn.course.week1;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int targetNumber = random.nextInt(100) + 1;  // Generating a random number between 1 and 100
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100 inclusive.");
        
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
                break;
            }
        }
        
        scanner.close();
    }
}
