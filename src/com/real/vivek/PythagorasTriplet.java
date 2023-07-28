package com.real.vivek;

import java.util.Scanner;

//Program to find if given numbers are pythagoras triplet
public class PythagorasTriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int greaterNum;
		int base;
		int height;
		if (num1 > num2 && num1 > num3) {
			greaterNum = num1;
			base = num2;
			height = num3;
		} else if (num2 > num1 && num2 > num3) {
			greaterNum = num2;
			base = num1;
			height = num3;
		} else {
			greaterNum = num3;
			base = num1;
			height = num2;
		}

		if (greaterNum * greaterNum == (base * base + height * height)) {
			System.out.println("Numbers are pythagoras triplet");
		} else {
			System.out.println("Numbers are not pythagoras triplet");
		}
	}

}
