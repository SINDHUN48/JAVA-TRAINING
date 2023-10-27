package com.tnsif.day2;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		System.out.println(q);
		
		for(int i=0;i<10;i++)
		{
			q.add(i);
		}
		System.out.println("Elements of queue:"+q);
		
		//to remove the head of the queue
		int remove = q.remove();
		System.out.println("Head element:"+remove);
		
		//to view the head of the queue
		int head = q.peek();
		System.out.println("Head of the queue:"+head);

	}

}
