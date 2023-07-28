package com.real.vivek;

import java.util.Scanner;

//Program to print all digits of a number and count of the digits
public class DigitsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int digitCount = 0;
		System.out.println("Digits of number:");
		while (num != 0) {
			int digit = num % 10;
			System.out.println(digit);
			digitCount++;
			num = num / 10;
		}
		System.out.println("Number of digits: " + digitCount);
	}

}
