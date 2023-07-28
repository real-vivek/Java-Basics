package com.real.vivek;

import java.util.Scanner;

//Program to print inverse of number: https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse-of-a-number-official/ojquestion
public class InverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int digitCount = 1;
		int inverseNumber = 0;
		while (num != 0) {
			int digit = num % 10;
			inverseNumber = inverseNumber + digitCount * (int) Math.pow(10, --digit);
			num = num / 10;
			digitCount++;
		}

		System.out.println("Inversed number is: " + inverseNumber);
	}

}
