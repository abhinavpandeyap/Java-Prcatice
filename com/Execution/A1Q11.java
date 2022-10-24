package com.Execution;

import java.util.Scanner;

public class A1Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		boolean flag=true;
		System.out.println("Enter any Number : ");
        n=sc.nextInt();
        for(int j=2;j<=n/2;j++)
        {
        	if(n%j==0)
        		flag=false;
        }
        if(flag==false)
        	System.out.println("The Number is not Prime");
        else if(flag==true) 
			System.out.println("The Number is Prime");
		
	}

}
