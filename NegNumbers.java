package com.bptn.course.week1;

		import java.util.Scanner;


		public class NegNumbers {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter an integer");
				int d = sc.nextInt();
				
				if (d > 0) { 
					System.out.println("positive");
					
					
				}else {
					System.out.println("negative");
				}
				
				sc.close();
			}

		

	}


