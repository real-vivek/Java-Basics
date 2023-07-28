package com.real.vivek;

import java.util.Scanner;

//Program to rotate a number
public class GCFAndLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//Here we are setting mock GCF value
		int GCF=1;
		// Solution 1: GCF is greatest common factor so we start dividing from smaller number till 1 and get the greatest number which divides both numbers
		int smallerNum = num1 < num2 ? num1 : num2;
		for (int i = smallerNum; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println("GCF is: " + i);
				GCF=i;
				break;
			}
		}

		// Solution 2: Here we divide 2 numbers and get remainder if remainder is not zero then keep dividing using remainder as divisor and previous divisor as dividend 
		// If we get remainder as zero then divisor is the GCF
//		int remainder;
//		do {
//			remainder = num1 % num2;
//			num1 = num2;
//			num2 = remainder;
//		} while (remainder != 0);
//		System.out.println("GCF is: " + num1);

		
		//To find LCM we use property LCM*GCF=num1*num2
		System.out.println("LCM is: "+num1*num2/GCF);
	}

}
