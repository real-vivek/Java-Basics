package com.real.vivek;

import java.util.Arrays;
import java.util.Scanner;

//https://www.pepcoding.com/resources/online-java-foundation/getting-started/benjamin-bulbs-official/ojquestion
public class BenjimanBulbs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int[] bulbArr = new int[num + 1];
		// This loop is for simulating voltage fluctuations
		for (int i = 1; i < bulbArr.length; i++) {

			// This for loop iterates over array of bulbs and toggles it
			for (int j = 1; j < bulbArr.length; j++) {
				if (j % i == 0) {
					if (bulbArr[j] == 0) {
						bulbArr[j] = 1;
					} else {
						bulbArr[j] = 0;
					}
				}
			}
		}

		//Here we remove the 0th element array
		System.out.println(Arrays.toString(Arrays.copyOfRange(bulbArr, 1, bulbArr.length)));
	}

}
