package com.real.vivek.number.system;

import java.util.Scanner;

public class AnyBaseToAnyDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int tempNum = num;
		System.out.println("Enter base in which it is: ");
		int base = sc.nextInt();
		int count = 0;
		int decimalNum = 0;
		// We divide the number by 10,get remainder and multiply the remainder with baseNumber to power
		while (num != 0) {
			int digit = num % 10;
			decimalNum = decimalNum + digit * (int) Math.pow(base, count++);
			num = num / 10;
		}
		System.out.println(tempNum + " in base " + base + " is " + decimalNum + " in decimal");
	}

}
