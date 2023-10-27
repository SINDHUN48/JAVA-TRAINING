package com.tnsif.day2;

public class StringBufferDemo {

	public static void main(String[] args) {
		//string buffer vs capacity
		StringBuilder buffer = new StringBuilder("welcome");
		System.out.println("Buffer =" +buffer);
		System.out.println("length =" +buffer.length());
		System.out.println("capacity" + buffer.capacity());
		
		//appending and inserting into stringbuffer
		String s;
		int a = 45;
		buffer = new StringBuilder(41);
		
		s = buffer.append("a = ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer = new StringBuilder("I JAVA!");
		buffer.insert(2, "linked ");
		System.out.println(buffer);
		
		buffer.delete(7, 11);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());

	}

}
