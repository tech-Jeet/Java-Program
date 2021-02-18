package com.jeet.test;

import java.util.Scanner;

public class PerfectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no ::");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i < num; i++) {
			if(num % i ==0) {
				sum = sum + i;
			}
		}
		//28, 6 is perfect num
		if(sum == num) {
			System.out.println("num is perfect num");
		} else {
			System.out.println("num is not perfect num");
		}
	}

}
