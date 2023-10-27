package com.tnsif.day2;

public class StringBuffer {
	

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println("Builder:"+builder);
		System.out.println("Length of the buffer:"+builder.length());
		System.out.println("Builder Capacity:"+builder.capacity());
		
		//appending and inserting
		String s;
		int a=57;
		builder = new StringBuilder(40);
		s=builder.append("a=").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(builder);
	}

}
