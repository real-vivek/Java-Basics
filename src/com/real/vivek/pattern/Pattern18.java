package com.real.vivek.pattern;

import java.util.Scanner;

/*

*****
 * * 
  *  
 *** 
*****

 */
public class Pattern18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || i + j == num - 1 || i == j || (i + j > num - 1 && i > j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
