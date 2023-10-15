package com.real.vivek.pattern;

import java.util.Scanner;


/*

****
 ***
  **
   *

*/
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		//Solution 1: using array conditions
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(j>=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//Solution 2
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < i ; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <num-i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
