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

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if ((i <= num / 2 && j <= num / 2 && i + j == num / 2)
						|| (i <= num / 2 && j > num / 2 && j - i == num / 2)
						|| (i > num / 2 && j <= num / 2 && i - j == num / 2)
						|| (i > num / 2 && j > num / 2 && i + j == (num-1+(num/2)))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
