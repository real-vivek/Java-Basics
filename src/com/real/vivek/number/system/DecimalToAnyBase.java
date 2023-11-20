package com.real.vivek.number.system;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int tempNum = num;
		System.out.println("Enter base to which you want to convert: ");
		int base = sc.nextInt();
		int count = 0;
		int convertedNum = 0;
		// We divide the number by base,get remainder and collect the remainders in reverse to get convertedNumber
		while (num != 0) {
			int digit = num % base;
			convertedNum = convertedNum + digit * (int) Math.pow(10, count++);
			num = num / base;
		}
		System.out.println(tempNum + "in decimal is " + convertedNum + " in base " + base);
	}

}
