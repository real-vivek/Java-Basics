package com.real.vivek.pattern;

import java.util.Scanner;

/*
//n is odd
  
		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	
 
 */
public class Pattern17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		for (int i = 0; i <= num / 2; i++) {

			for (int j = 0; j < num / 2 - i; j++) {
				System.out.print("\t");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				if (j < (2 * i + 1) / 2 && i != num / 2) {
					System.out.print("\t");
				} else {
					System.out.print("*" + "\t");
				}

			}
			System.out.println();
		}

		for (int i = 0; i < num / 2; i++) {

			for (int j = 0; j < num / 2; j++) {
				System.out.print("\t");
			}
			for (int j = 0; j < num / 2 - i; j++) {
				System.out.print("*" + "\t");
			}
			System.out.println();
		}

	}

}
