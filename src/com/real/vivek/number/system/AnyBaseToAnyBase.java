package com.real.vivek.number.system;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int tempNum = num;

		System.out.println("Enter base in which it is: ");
		int baseOfNum = sc.nextInt();

		System.out.println("Enter base in which you want to convert: ");
		int convertToBase = sc.nextInt();
		int convertedNum = 0;
		int count = 0;
		int decimalNum = 0;
		if (baseOfNum == 10) {
			convertedNum = convertToAnyBase(num, convertToBase);
		} else if (convertToBase == 10) {
			convertedNum = convertToDecimal(num, convertToBase);
		} else {
			// First we get decimal number and then convert decimal number to other base
			convertedNum = convertToDecimal(num, baseOfNum);
			convertedNum = convertToAnyBase(convertedNum, convertToBase);
		}

		System.out.println(tempNum + " in base " + baseOfNum + " is " + convertedNum + " in base " + convertToBase);
	}

	public static int convertToDecimal(int num, int base) {
		int decimalNum = 0;
		int count = 0;
		while (num != 0) {
			int digit = num % 10;
			decimalNum = decimalNum + digit * (int) Math.pow(base, count++);
			num = num / 10;
		}
		return decimalNum;
	}

	public static int convertToAnyBase(int num, int base) {
		int convertedNum = 0;
		int count = 0;
		while (num != 0) {
			int digit = num % base;
			convertedNum = convertedNum + digit * (int) Math.pow(10, count++);
			num = num / base;
		}
		return convertedNum;
	}

}
