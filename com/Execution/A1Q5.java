package com.Execution;

import java.util.Scanner;

public class A1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		a=sc.nextInt();
	    if(a%35==0)
	    	System.out.println("This Number is divisible by 5 & 7");
	    else {
			System.out.println("This Number is not divisible by 5 & 7");
			
		}
		
		

	}

}
