package com.jeet.test;

import java.util.Scanner;

public class DivExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no");
		int a = sc.nextInt();
		System.out.println("enter second no");
		int b = sc.nextInt();
		
		while(a >=  b) {
			a = a-b;
		}
		System.out.println("Divide is ::" + a);
	}

}
