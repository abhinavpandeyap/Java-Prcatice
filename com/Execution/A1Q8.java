package com.Execution;

import java.util.Scanner;

public class A1Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a1,a2,a3;
		System.out.println("Enter the angles of a Triangle");
		a1=sc.nextInt();
		a2=sc.nextInt();
		a3=sc.nextInt();
		if((a1+a2+a3)==180)
			System.out.println("This is a valid Triangle");
		else
			System.out.println("This is not a valid Triangle");
	}

}
