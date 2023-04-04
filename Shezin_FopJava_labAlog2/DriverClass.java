package com.greatlearning.iitr.dsa.labsession_2;

import java.util.Arrays;
import java.util.Scanner;
 
public class DriverClass {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter total number of currency notes in your country ");
	int size =sc.nextInt();
	
	int currency[]=new int[size];
	
	System.out.println("Enter the denominations");
	
	for(int i = 0;i<size;i++) 
		
		currency [i] = sc.nextInt();
		
		System.out.println("Before sorting"+ Arrays.toString(currency));
		
		MergeSort ms = new MergeSort();
		
		ms.sort(currency,0,size-1);
		
		System.out.println("After sorting" + Arrays.toString(currency));
		
		System.out.println("Enter total amount");
		
		int amount = sc.nextInt();
		
		NoteCount nc = new NoteCount();
		
		nc.counting(currency,amount);
		
		
		
	}

		
}


