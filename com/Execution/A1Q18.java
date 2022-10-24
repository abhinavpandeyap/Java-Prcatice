package com.Execution;

import java.util.Scanner;

public class A1Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter any 3 Numbers : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		if(n1>n2) {
			if(n1>n3)
				System.out.println(n1+" is the greatest number ");
			else 
				System.out.println(n3+" is the greatest number");
			
		}
		else if(n2>n1) {
			if(n2>n3)
				System.out.println(n2+" is the greatest number ");
			else 
				System.out.println(n3+" is the greatest number");
			
			
		}
		else 
			System.out.println(n3+" is the greatest number ");

	}

}
