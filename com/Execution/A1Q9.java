package com.Execution;

import java.util.Scanner;

public class A1Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		a=sc.nextInt();
		for(int i=1;i<=a;i++) 
		
			fact=fact*i;
		
		System.out.println("Factorial of the Number is :"+fact);
	}

}
