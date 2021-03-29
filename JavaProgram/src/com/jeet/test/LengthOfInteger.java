package com.jeet.test;

import java.util.Scanner;

public class LengthOfInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your no");
		
		int num = sc.nextInt();
		
		int count = 0;
		
		while(num > 0) {           
			num = num/10;
			count = count + 1;
		}
		System.out.println(count);
		
		System.out.println((num + "" ).length());
	}

}
