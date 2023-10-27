package com.tnsif.day2;

public class StringOperator {

	public static void main(String[] args) {
		String s1 = new String("Indian");
		String s2 =s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.substring(2,5));
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		System.out.println(s1.isEmpty());
	    
		
		//String comparison
		//== and equals
		
		s1="Good Night";
		s2=new String(s1);
		
		//equals = equality
		System.out.println(s1+ "Equals" +s2+"------->"+s1.equals(s2));
		
		//= --->two object references to check whether they refer to the same instance
		System.out.println(s1+" == "+s2+"----->"+(s1==s2));
		

	}

}
