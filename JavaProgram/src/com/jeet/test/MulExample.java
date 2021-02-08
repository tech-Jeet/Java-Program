package com.jeet.test;

import java.util.Scanner;

public class MulExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int a = sc.nextInt();
		System.out.println("enter second no");
		int b = sc.nextInt();
		
		int count = 0;
		
		while(a >= b) {
			a = a - b;
			count = count+1;
		}
		System.out.println("mul is ::"+ count);
	}

}
