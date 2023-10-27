package com.tnsif.day2;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String>pq = new PriorityQueue<>();
		pq.add("Core Java");
		pq.add("React");
		pq.add("Angular");
		pq.add("Ruby");
		pq.add("Bootstrap");
		System.out.println(pq);
		
		pq.remove("Angular");
		System.out.println("After remove:"+pq);
		
		System.out.println("Poll Method:"+pq.poll());
		
		Iterator<String>iterator=pq.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()+"");
		}
	}

}
