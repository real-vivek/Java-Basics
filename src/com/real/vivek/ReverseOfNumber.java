package com.real.vivek;

import java.util.Scanner;

//Program to reverseDigits of number and form a new number
public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int tempNum = num;
		int digitCount = 0;
		int reverseNumber = 0;
		while (num != 0) {
			digitCount++;
			num = num / 10;
		}
		while (tempNum != 0) {
			int digit = tempNum % 10;
			reverseNumber = reverseNumber + digit * (int) Math.pow(10, --digitCount);
			tempNum = tempNum / 10;
		}

		System.out.println("Reversed number is: " + reverseNumber);
	}

}
