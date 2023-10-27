package com.tnsif.day2;

public class OverloadingDemo {
public static void main(String[]args)  {
		
		System.out.println("....default constructor.....");
		Point p =new Point();
		System.out.println(p);
		
		Point p1 = new Point(14.5f); //single parameter constructor
		System.out.println(p1);
		
		Point p3 = new Point(15.77f,35.8f); //twp parameter constructor
		System.out.println(p3);
		
		System.out.println("......method overloading.....");
		
		System.out.println("Addition of two integers :"  +MethodOverloading.addition(10.7f,9.7f));
		System.out.println("Addition of two integers :"  +MethodOverloading.addition(20,13.7f));
		System.out.println("Addition of two integers :"  +MethodOverloading.addition(15.88f,46));
		System.out.println("Addition of two integers :"  +MethodOverloading.addition("Hello", "World"));

}
}