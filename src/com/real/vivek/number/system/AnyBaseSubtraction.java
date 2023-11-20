package com.real.vivek.number.system;

import java.util.Scanner;

public class AnyBaseSubtraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter greater number and then smaller number you want to subtract:");
		int num1 = sc.nextInt();
		int tempNum1 = num1;
		int num2 = sc.nextInt();
		int tempNum2 = num2;
		System.out.println("Enter base in which the numbers are: ");
		int baseOfNum = sc.nextInt();
		int count = 0;
		int carryForward = 0;
		int sub = 0;
		while (num1 != 0 || num2 != 0) {
			int digit1 = 0, digit2 = 0;
			if (num1 != 0) {
				digit1 = num1 % 10;
			}
			if (num2 != 0) {
				digit2 = num2 % 10;
			}

			// Carry forward condition when digit is smaller or when digit is zero and
			// carryForward is -1
			// if we have digit1 as 0 and digit CF as -1 then also this condition will occur
			if (digit1 < digit2 || carryForward == -1) {
				// This will occur when we have num1 with 3 digits and num2 with 1 here we do
				// not add baseNumber
				if (digit1 > digit2) {
					digit1 = digit1 + carryForward;
					carryForward = 0;
				} else {
					digit1 = digit1 + carryForward + baseOfNum;
					carryForward = -1;
				}

			}

			int subResult = digit1 - digit2;
			sub = sub + subResult * (int) Math.pow(10, count++);

			if (num1 != 0) {
				num1 = num1 / 10;
			}
			if (num2 != 0) {
				num2 = num2 / 10;
			}

		}

		System.out.println("Subtraction of " + tempNum1 + ", " + tempNum2 + " in base " + baseOfNum + " is " + sub);
	}

}
