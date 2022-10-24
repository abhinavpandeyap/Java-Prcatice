package com.Assignments;
import java.util.Scanner;
public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter The Size of Array: ");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0; i<size; i++) {
			num[i]=sc.nextInt();
			
		}
		System.out.println("Enter the element you want to search");
		int search=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(num[i]==search) {
				System.out.println("The index of this Element is "+i);
			}
		}

	}

}
