package com.real.vivek;

import java.util.Scanner;

//Program to rotate a number
public class RotateNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int tempNum = num;
		System.out.println("Enter times you want to rotate:");
		int rotateTimes = sc.nextInt();
		int digitCount = 0;
		while (num != 0) {
			digitCount++;
			num = num / 10;
		}
		while (rotateTimes > 0 && rotateTimes != 0) {
			int digit = tempNum % 10;
			tempNum = tempNum / 10;
			tempNum = tempNum + digit * (int) Math.pow(10, digitCount - 1);
			rotateTimes--;
		}

		while (rotateTimes < 0 && rotateTimes != 0) {
			int digit = tempNum / ((int) Math.pow(10, digitCount - 1));
			tempNum = tempNum % ((int) Math.pow(10, digitCount - 1));
			tempNum = tempNum*10 + digit;
			rotateTimes++;
		}
		System.out.println("Rotated Number is: " + tempNum);
	}

}
