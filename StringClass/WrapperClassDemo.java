package com.tnsif.day2;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		@SuppressWarnings("removal")
		Integer i = new Integer(20);
		System.out.println(i);
		
		int c = i.intValue();
		System.out.println(c);

		
		int d = i;
		System.out.println(d);
	}

}
