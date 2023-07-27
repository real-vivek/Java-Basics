package com.real.vivek;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		boolean isPrime = true;
		// Optimization: If there are any factors of a number they will occur till its square root
		// i.e. any number(factor) that divides our number completely has to occur till our square root  
		// Thus we have to iterate will square of the number only if there is any number that divides our given number
		// Then num is non-prime, we have to check for square root also hence the = sign in condition
		// The time complexity of the code is now sqRoot(n) 
		for (int i = 2; i*i <= num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println((num == 2 || isPrime) ? "Number " + num + " is Prime" : "Number " + num + " is Non-Prime");
	}

}
