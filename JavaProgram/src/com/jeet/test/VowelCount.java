package com.jeet.test;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		String str1 = str.toLowerCase();
		
		int count = 0;
		char[] array = str1.toCharArray();
		for(char ch : array) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count = count + 1;
			}
		}
		System.out.println("vowel is ::"+ count);
	}

}
