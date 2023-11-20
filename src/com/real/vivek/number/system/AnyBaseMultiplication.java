package com.real.vivek.number.system;

import java.util.Scanner;

public class AnyBaseMultiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a base: ");
		int base = scanner.nextInt();
		System.out.println("Enter 1st number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = scanner.nextInt();
		int mulResult = 0;
		int outterCount = 0;

		while (num2 != 0) {

			int digit2 = 0;
			if (num2 != 0) {
				digit2 = num2 % 10;
			}

			int multiplication = 0;
			int cF = 0;
			int innerCount = 0;
			int tempNum1 = num1;
			while (cF != 0 || tempNum1 != 0) {
				int digit1 = 0;
				if (tempNum1 != 0) {
					digit1 = tempNum1 % 10;
				}
				int mul = digit1 * digit2 + cF;
				cF = 0;
				if (mul >= base) {
					cF = mul / base;
					multiplication = multiplication + (mul % base) * (int) Math.pow(10, innerCount);
				} else {
					multiplication = multiplication + mul * (int) Math.pow(10, innerCount);
				}
				innerCount++;
				tempNum1 = tempNum1 / 10;
			}

			multiplication = multiplication * (int) Math.pow(10, outterCount++);
			mulResult = addAnyBase(mulResult, multiplication, base);
			num2 = num2 / 10;
		}
		System.out.println("Multiplication result: " + mulResult);
	}

	static int addAnyBase(int num1, int num2, int base) {
		int cF = 0;
		int sum = 0;
		int count = 0;
		while (cF != 0 || num1 != 0 || num2 != 0) {
			int d1 = 0;
			int d2 = 0;

			if (num1 != 0) {
				d1 = num1 % 10;
				num1 = num1 / 10;
			}

			if (num2 != 0) {
				d2 = num2 % 10;
				num2 = num2 / 10;
			}

			int addResult = d1 + d2 + cF;
			cF = 0;
			if (addResult >= base) {
				cF = addResult / base;
				sum = sum + (addResult % base) * (int) Math.pow(10, count++);
			} else {
				sum = sum + addResult * (int) Math.pow(10, count++);
			}

		}
		return sum;
	}

}
