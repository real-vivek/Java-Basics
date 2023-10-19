package com.real.vivek.pattern;

import java.util.Scanner;

/*

1	
2	3	
4	5	6	
7	8	9	10 

*/
public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int count = 1;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(count++ + "\t");
			}
			System.out.println();
		}

	}
}
