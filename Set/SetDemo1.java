package com.tnsif.day2;

import java.util.*;

public class SetDemo1 {

	static void addElement(HashSet<Integer> s) {
		s.add(30);
		s.add(40);
		s.add(21);
		s.add(14);
		s.add(18);
		System.out.println(s.add(30));
		System.out.println(s);
		System.out.println(s.add(50));
	}

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		addElement(s);
		System.out.println(s);


	}

}
