package com.jeet.test;

import java.util.Scanner;

public class RemExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no");
		int a= sc.nextInt();
		System.out.println("enter second no");
		int b= sc.nextInt();

		while(a >= b) {
			a=a-b;
		}
		System.out.println("remainder is ::" +a);
	}

}
