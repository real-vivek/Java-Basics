package com.real.vivek.pattern;

import java.util.Scanner;

/*
//n is odd

**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****

*/
public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		for (int i = 0; i <= num / 2; i++) {
			for (int j = 0; j < ((num + 2) / 2) - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < (2 * i + 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < ((num + 2) / 2) - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < num / 2; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= ((num / 2) - i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < ((num / 2) - i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
