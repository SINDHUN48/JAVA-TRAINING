package com.tnsif.day2;

import java.util.*;

public class CardQueue {
	private static Scanner sc;

	public static void main(String[] args) {
	
	   LinkedList<Integer>ll= new  LinkedList<Integer> ();
	   sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   while(n!=0)
	   {
		   ll.add(sc.nextInt());
		   n--;
	   }
	   Collections.shuffle(ll);
	   System.out.println(ll);	   
	   
	}
}
