package com.Assignments;

import java.util.Scanner;


public class searchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array: " );
		int size=sc.nextInt();
		int[] num=new int[size];
		boolean flag;
		System.out.println("Enter the elements of the Array");
		for(int i=0; i<size; i++) {
			 num[i]=sc.nextInt();
			
			
		}
		System.out.println("Enter the elements you want to search ");
		int search=sc.nextInt();
		for(int i=0; i<size; i++) {
			if(num[i]==search) {
			    flag=true;
				
				
			}
			else {
				 flag=false;
					
				
			}
			
			}
		if(flag=true)
			System.out.println("yes this array contains this element "+search);
		else 
			System.out.println("This array does not contain this Element");
		
		}

}
