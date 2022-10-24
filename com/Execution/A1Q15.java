package com.Execution;


import java.util.Scanner;

public class A1Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,rem,rev=0;
		System.out.println("Enter any Number");
		n=sc.nextInt();
		while(n!=0) {
			
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse No. is "+rev);

	}

}
