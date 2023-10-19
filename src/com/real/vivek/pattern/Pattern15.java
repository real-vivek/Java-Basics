package com.real.vivek.pattern;

import java.util.Scanner;

/*

  1
 232
34543
 232
  1

*/
public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		for (int i = 0; i <= num / 2; i++) {
			int k = i;
			for (int j = 0; j < ((num / 2) - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < ((2 * i) + 1); j++) {
				if (j > (2 * i + 1) / 2) {
					System.out.print(--k);
				} else {
					System.out.print(++k);
				}
			}
			System.out.println();
		}

		for (int i = 0; i < num / 2; i++) {
			int k = (num / 2) - (i + 1);
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (num / 2 - i); j++) {
				System.out.print(++k);
			}
			for (int j = 0; j < (num / 2 - i - 1); j++) {
				System.out.print(--k);
			}
			System.out.println();
		}
		
		
		

//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int count = 0;
//		for (int i = 0; i <= n / 2; i++) {
//
//			for (int j = 0; j < n / 2 - i; j++) {
//				System.out.print(" ");
//			}
//			count = i;
//			for (int j = 0; j < 2 * i + 1; j++) {
//				if (j <= (2 * i + 1) / 2) {
//					System.out.print(++count);
//				} else {
//					System.out.print(--count);
//				}
//			}
//
//			System.out.println();
//		}
//
//		for (int i = 0; i < n / 2; i++) {
//			count=count-2;
//
//			for (int j = 0; j <= i; j++) {
//				System.out.print(" ");
//			}
//
//			for (int j = 0; j < n / 2 - i; j++) {
//				System.out.print(++count);
//			}
//			for (int j = 0; j < n / 2 - i - 1; j++) {
//				System.out.print(--count);
//			}
//			System.out.println();
//		}
	
	}
}
