package com.jeet.test;

import java.util.Scanner;

public class SubExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int a = sc.nextInt();
		System.out.println("Enter second no");
		int b = sc.nextInt();
		
		//logic for sub
		int c = a + (~b + 1);
		
		System.out.println("sub is :: "+ c);

	}

}
