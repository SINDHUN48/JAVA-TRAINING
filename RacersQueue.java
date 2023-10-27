package com.tnsif.day2;

import java.util.*;

public class RacersQueue {
	 
		private static Scanner sc;

		public static void main(String args[]) {
			sc = new Scanner(System.in);
			int n=sc.nextInt();
			ArrayList<String>a1= new ArrayList<String>();
			for(int i=0;i<n;i++)
			{
			    a1.add(sc.next());	
			}
			Collections.swap(a1, 2, 5);
			for(String str: a1)
			{
				System.out.println(str);
			}
		}	
}
