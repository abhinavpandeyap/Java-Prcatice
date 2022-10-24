package com.Execution;

import java.util.Scanner;

public class A1Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n;
    int sumeven=0,sumodd=0;
    System.out.println("Enter the limit of the Series");
    n=sc.nextInt();
    for(int i=1;i<=n;i++) {
    	if(i%2==0) 
    		sumeven=sumeven+i;
      else
    		sumodd=sumodd+i;
    }	
    	
    	System.out.println("Sum of all even Numbers till "+n+" is "+sumeven);
    	System.out.println("Sum of all even Numbers till "+n+" is "+sumodd);
    
	}

}
