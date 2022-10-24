package com.Execution;

import java.util.Scanner;

public class A1Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int count=0;
		System.out.println("Enter the limit till which you want the prime numbers");
		n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			        count=0;
			for (int j = 2; j<=i/2; j++) {
				if (i % j == 0)
					count++;
			}
			if (count==0) 
				System.out.print(i + " ");
			
			}
		}

	}


