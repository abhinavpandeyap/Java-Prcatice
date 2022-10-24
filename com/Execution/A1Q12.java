package com.Execution;

import java.util.Scanner;

public class A1Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n,sum=0;
       System.out.println("Enter the limit of the series: ");
       n=sc.nextInt();
       for(int i=1;i<=n;i++) 
    	   sum=i+sum;
    	  System.out.println("Sum of the series(1 to limit) is "+sum);
    		   
	}

}
