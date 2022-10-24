package com.Execution;

import java.util.Scanner;

public class A1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter any Character in lowercase");
		ch=sc.next().charAt(0);
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("This is a Vowel");
		}
		else {
			System.out.println("This is a Consonant");
		}

	}

}
