package com.real.vivek;

import java.util.Scanner;

//Program to print given number of Fibonacci numbers
public class NFibNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int previousNum = 0;
		int nextNum = 1;
		for (int i = 0; i < num; i++) {
			System.out.print(previousNum + ", ");
			int tempPreviousNum = previousNum;
			previousNum = nextNum;
			nextNum = tempPreviousNum + nextNum;
		}
	}

}
