package com.real.vivek.pattern;

import java.util.Scanner;

/*

*   
 *  
  * 
   *

*/
public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
