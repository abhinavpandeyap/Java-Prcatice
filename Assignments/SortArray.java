package com.Assignments;
import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[10];
		String[] str=new String [10];
		Scanner sc= new Scanner(System.in);
            for(int i=0; i<10; i++) {
            	num[i]=sc.nextInt();
            	} 
            for(int i=0; i<10; i++) {
                	str[i]=sc.nextLine();
                	
                 }
            Arrays.sort(num);
            System.out.print(Arrays.toString(num));
            
            Arrays.sort(str);
            System.out.print(Arrays.toString(str));
           
	}

}
