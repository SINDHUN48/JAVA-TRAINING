package com.tnsif.day2;

public class LinkedHashSet {

	public static void main(String[] args) {
	    LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(30);
		lhs.add(20);
		lhs.add(40);
		lhs.add(21);
		lhs.add(14);
		lhs.add(18);
		lhs.add(06);
		System.out.println("LinkedHashSet:"+lhs);

	}

	private void add(int i) {
		// TODO Auto-generated method stub
		
	}
}


//*LinkedHashSet:
//* unique elements only like HashSet
//* permits null elements
//* maintains insertion order
//* doubly lined list
