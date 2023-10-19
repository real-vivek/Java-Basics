package com.real.vivek.pattern;

import java.util.Scanner;

/*

0	
1	1	
2	3	5	
8	13	21	34

*/
public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int prev=0;
		int next=1;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(prev+"\t");
				int tempPrev=prev;
				prev=next;
				next=next+tempPrev;
			}
			System.out.println();
		}

	}
}
