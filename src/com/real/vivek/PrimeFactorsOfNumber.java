package com.real.vivek;

import java.util.Scanner;

//Program to print the prime factors of a number
public class PrimeFactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int divisor = 2;
		System.out.print("Prime factors are: ");
		while (num != 1) {
			if (num % divisor != 0) {
				divisor++;
			} else {
				System.out.print(divisor+", ");
				num=num/divisor;
			}
		}
	}

}
