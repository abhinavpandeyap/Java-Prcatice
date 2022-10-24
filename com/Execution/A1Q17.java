package com.Execution;

import java.util.Scanner;
import java.lang.Math;

public class A1Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        int n,rev=0,rem;
        double sum=0;
        int original=0,temp=0,digit=0;
        System.out.println("Enter any Number to check if it is Armstrong");
        n=scanner.nextInt();
        original=n;
        temp=n;
        while(temp!=0) {
        	
        	temp=temp/10;
        	digit++;
        }
        
        	
        
        while(n!=0) {
        	rem=n%10;
        	rev=rev*10+rem;
        	sum=sum+(Math.pow(rem,digit));
             n=n/10;
            }
        if(original==sum)
        	System.out.println("This is an Armstrong Number");
        else 
        	System.out.println("This is not an Armstrong Number");
	}

}
