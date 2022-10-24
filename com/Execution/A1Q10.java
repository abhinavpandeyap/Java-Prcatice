package com.Execution;

import java.util.Scanner;

public class A1Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter Two Numbers(m & n)");
        m=sc.nextInt();
        n=sc.nextInt();
        int pow=m;
        for(int i=1;i<=n;i++) 
        {
        	pow=pow*m;
          
        }
        System.out.println(m+" to the power "+n+" is : "+pow);

	}

}
