package com.real.vivek;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		boolean isPrime = true;
		// We iterate from 2 till the number-1 and check if num is divisible by any number
		// If it is divisible then num is non-prime
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		System.out.println((num == 2 || isPrime) ? "Number " + num + " is Prime" : "Number " + num + " is Non-Prime");
	}

}
