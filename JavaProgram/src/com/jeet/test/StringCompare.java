package com.jeet.test;

import java.util.Scanner;

public class StringCompare {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = sc.nextLine();
		System.out.println("enter sub Sring");
		String subString = sc.next();
		
		String[] strArray = str.split(" ");
		boolean flag = false;
		
		for(String str1 : strArray) {
			if(str1.equalsIgnoreCase(subString)) {
				flag = true;
			}
		}
		System.out.println("sub String present in String :: "+ flag);
	}

}
