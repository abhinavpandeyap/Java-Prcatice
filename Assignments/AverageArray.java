package com.Assignments;
import java.util.Scanner;



public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
        int[] num=new int[size];
        int sum=0,avg=0;
        System.out.println("Enter the Elements of Array");
        
        for(int i=0; i<size; i++) {
        	num[i]=sc.nextInt();
        	sum=sum+num[i];
        }
        avg=sum/size;
        System.out.println("Average of these numbers are : "+avg);
	}
 
}
