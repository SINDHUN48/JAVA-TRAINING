package com.tnsif.day2;

public class StringComparison {

	public static void main(String[] args) {
		// creating strings using literals
		String s1 = "TNPSC";
		String s2 = "TNPSC";
		
		//creating strings using new operator
		String s3 = new String("GATE");
		String s4 = new String("GATE");
		
		//== and equals
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s1==s3:"+(s1==s3));
		System.out.println("s4==s3:"+(s4==s3));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compareTo
		System.out.println(s3.compareTo("TNPSC"));
		System.out.println(s3.compareToIgnoreCase("TNPSC"));
		System.out.println(s3.compareTo(s2));

	}

}
