package com.real.vivek.pattern;

import java.util.Scanner;

/*

1     1
12   21
123 321
1234321

*/
public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int temp = 0;
			for (int j = 0; j <= i; j++) {
				System.out.print(++temp);
			}
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < num - i - 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (i == num - 1 && j == 0) {
					continue;
				}
				if (i == num - 1) {
					System.out.print(--temp);
				} else {
					System.out.print(temp--);
				}
			}
			System.out.println();
		}
	}
}
