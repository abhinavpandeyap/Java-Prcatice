package com.Assignments;

public class PrintGrid {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
        for(int i=0;i<10;i++) {
        	for(int j=0; j<10; j++) {
        		count++;
        		if(count<10) {
        			System.out.print("-");
        			}  
        		else if (count==10) {
        			System.out.println("");
                     count=0;					
				}
        	}
        }
	}

}
