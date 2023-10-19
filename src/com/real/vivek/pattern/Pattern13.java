package com.real.vivek.pattern;

import java.util.Scanner;

/*
 
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	
1	5	10	10	5	1	
 
 */
public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int nCn = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(nCn + "\t");
				nCn = nCn * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}
