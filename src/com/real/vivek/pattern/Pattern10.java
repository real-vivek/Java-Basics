package com.real.vivek.pattern;

import java.util.Scanner;

/*
//n is odd
 
  *  
 * * 
*   *
 * * 
  *  

*/
public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int is = -1;
		int os = num / 2;

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < os; j++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int j = 0; j < is; j++) {
				System.out.print(" ");
			}

			if (i > 0 && i < num-1) {
				System.out.print("*");
			}
			if (i < num / 2) {
				os--;
				is += 2;
			} else {
				os++;
				is -= 2;
			}
			System.out.println();
		}
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num; j++) {
//				if ((i <= num / 2 && j <= num / 2 && i + j == num / 2)
//						|| (i <= num / 2 && j > num / 2 && j - i == num / 2)
//						|| (i > num / 2 && j <= num / 2 && i - j == num / 2)
//						|| (i > num / 2 && j > num / 2 && i + j == (num-1+(num/2)))) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

	}
}
