package com.real.vivek.pattern;

import java.util.Scanner;

/*

7 * 0 = 0
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49

*/
public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}
}
