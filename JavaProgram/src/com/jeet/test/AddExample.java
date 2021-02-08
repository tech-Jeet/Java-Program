package com.jeet.test;

import java.util.Scanner;

public class AddExample {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no");
		int a = sc.nextInt();
		System.out.println("Enter second no");
		int b = sc.nextInt();
		
		System.out.println("your No is ::"+ a +" "+ b);
		
		//main logic
		int c = a - (-b);
		
		System.out.println("sum is :: "+ c);

	}

}
