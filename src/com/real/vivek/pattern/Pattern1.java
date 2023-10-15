package com.real.vivek.pattern;

import java.util.Scanner;


/*

*
**
***
****

*/
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		//Solution 1
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num; j++) {
//				if(i>=j) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		//Solution 2: using array conditions
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
