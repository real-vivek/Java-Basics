package com.real.vivek;

import java.util.Scanner;

//Program to find all prime numbers till a given number
public class PrimeTillN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 2; i != 2 && j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}

		}
	}

}
