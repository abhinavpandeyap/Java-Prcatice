package com.Execution;

import java.util.Scanner;

public class A1Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,rem,rev=0;
		System.out.println("Enter any Number to check whether it is Palindrome");
		n=sc.nextInt();
		int original;
		original=n;
	    while(n!=0)
	    {
	    	rem=n%10;
	    	rev=rev*10+rem;
	    	n=n/10;
	    	
	    }
	    if(original==rev)
	    	System.out.println("This is a Palindrome");
	    else 
	    	System.out.println("This is not a Palindorme");
		

	}

}
