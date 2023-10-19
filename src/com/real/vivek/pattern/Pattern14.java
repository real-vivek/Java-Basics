package com.real.vivek.pattern;

import java.util.Scanner;

/*

0	
1	1	
2	3	5	
8	13	21	34

*/
public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}
}
