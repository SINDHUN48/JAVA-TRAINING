package com.tnsif.day2;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Script");
		list.add("C++");
		list.add("C");
		list.add("Python");
		list.add("Ruby");
		list.add("Mongodb");
		list.add("Compiler");
		Collections.shuffle(list);
		System.out.println("Results after shuffle operations:");
		for(String str: list)
		{
			System.out.println(str); 
		}
		
	}

}
