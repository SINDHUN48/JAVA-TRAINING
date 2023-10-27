// program to demonstrate abstract class
package com.tnsif.day2;
public  abstract class Shape {
	
	protected float area;
	
	//abstract class
	
	abstract void calArea();
	
	//concrete method
	void show()
	{
		System.out.println("Area of shape is "+area);
	}
}