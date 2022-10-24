package com.Assignments;

import java.util.Scanner;

import java.util.Arrays;

public class SumArray {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int sum=0;
		  int[] num=new int[10];
		  Scanner scanner= new Scanner(System.in);
		  System.out.println("Enter the Numbers");
		  for(int i=0; i<10; i++) {
			  num[i]=scanner.nextInt();
			  sum=sum+num[i];
			  
		  }
		  System.out.println("Sum of the Array Elements is"+sum);
		  
	}

}
