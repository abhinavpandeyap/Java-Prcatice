package com.Execution;

import java.util.Scanner;

public class A1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int basicsal,incomeTax;
		System.out.println("Enter the Basic Annual Salary: ");
		basicsal=sc.nextInt();
		if(basicsal<150000) 
		{
	        incomeTax=0;	
			System.out.println("Income Tax is : "+incomeTax);
		}
		if(basicsal>150000 && basicsal<300000)
		{ 
			incomeTax=basicsal*20/100;
			System.out.println("Income Tax is : "+incomeTax);
		}
		if(basicsal>300000)
		{
			incomeTax=basicsal*30/100;
			System.out.println("Income Tax is : "+incomeTax);
		}	


	}

}
