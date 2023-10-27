package com.tnsif.day2;

import java.util.*;

public class StringDemo {

	public static void main(String[] args) {
		char c[]= {'I','N','D','I','A'};
		String s1 = new String(c);
		String s2 = new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		//concatenation
		String longstr = "This is to show"+"how"+"concatenation takes place"+"with an additional operator";
		System.out.println(longstr);
		
		try (//scanner
		Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the String:");
			String str = s.next();//next() or //string str=s.nextLine();
			System.out.println("Entered string:"+str);
		}
		
		

	}

}
