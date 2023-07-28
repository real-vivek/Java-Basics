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
		
		//Optimized solution: After analysis we see that numbers who are perfect square(1,4,9,16,...) are the only ones being ON
		//Why perfect square? because number whose factors are even remain off and whose factors are odd remain ON
		//Any number which is not perfect square has 2n number of factors eg: 17: 1,17; 6: 1,2,3, 3,2,6 because 1*6,2*3,3*2, 3*2,2*3,6*1
		//Any number which is a perfect square has 2n+1 factors eg: 4: 1,2,4
		for (int i = 1; i*i <= num; i++) {
			System.out.println(i*i);
		}
	}

}
