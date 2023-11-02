package com.real.vivek.pattern;

import java.util.Scanner;

/*

*** *
  * *
*****
* *  
* ***

 */
public class Pattern19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if ((i == 0 && j <= num / 2) || 
						j == num / 2 || 
						i == num / 2 || 
						(j == 0 && i >= num / 2) || 
						(j == num - 1 && i <= num / 2) || 
						(i == num-1 && j >= num / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
