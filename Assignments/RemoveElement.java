package com.Assignments;
import java.util.Scanner;
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Size of the Array: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int index;
		int[] num=new int[size];
		int[] newArray=new int[size-1];
		System.out.println("Enter the Element of the Array: ");
		for(int i=0; i<size; i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("Enter the Element You want to remove from the Array");
        int rem=sc.nextInt(); 
		for(int i=0,k=0; i<size; i++) {
        	 if(num[i]==rem) {
        		 continue;
        	 }
        	 newArray[k++]=num[i];
         }
	}

}
