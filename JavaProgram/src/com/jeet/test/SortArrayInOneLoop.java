package com.jeet.test;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayInOneLoop {
	
	public static void main(String[] args) {
		
		//read the array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array length ::");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter Array Element");
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		//print the array
		System.out.println("Old Array is ::"+ Arrays.toString(array));
		
		//sort the array
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i] >array[i+1]) {
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
				i = -1;
			}
		}
		//print the sorted Array
		System.out.println("sorted Array is ::"+ Arrays.toString(array));
	}

}
