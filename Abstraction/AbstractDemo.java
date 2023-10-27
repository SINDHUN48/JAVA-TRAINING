package com.tnsif.day2;

public class AbstractDemo {

	public static void main(String[] args) {
		 Square sq= new Square();
		    Rectangle re = new Rectangle();
		    
		    sq.calArea();
		    sq.show();
		    
		    re.calArea();
		    re.show();
		    System.out.println(".............");
		    
		    //run time polymorphism / Dynamic binding / late binding

	}

}
