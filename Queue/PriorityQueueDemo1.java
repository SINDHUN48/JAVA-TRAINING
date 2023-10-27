package com.tnsif.day2;

import java.util.*;

public class PriorityQueueDemo1 {
	public static void main(String[] args) {
		PriorityQueue<String> pq1 = new PriorityQueue<>();
		System.out.println(pq1.peek());
		System.out.println(pq1.element());
		
		for(int i=0;i<=20;i++)
		{
			
			pq1.add(Integer.toString(i));
		}
	}
}
