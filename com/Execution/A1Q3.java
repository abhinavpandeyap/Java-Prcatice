package com.Execution;

import java.util.Scanner;

public class A1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp;
		Scanner scanner=new Scanner(System.in);   
        System.out.println("Enter the first number :");
        a=scanner.nextInt();
        System.out.println("Enter the second number :");
        b=scanner.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("Now the Swapped numbers are :"+a+" and "+b);
	}

}
