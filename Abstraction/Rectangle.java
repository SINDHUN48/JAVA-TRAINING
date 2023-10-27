package com.tnsif.day2;

public class Rectangle {

		  private float width,height;
	       
	       public  Rectangle() {
	    	   this.width= 5.0f;
	    	   this.height=5.0f;
	}
	       public  Rectangle(float width,float height) {
	    	   this.width= width;
	    	   this.height=height;
	    	   
	       }
		
		public void calArea() {
			float area = width*height;
			System.out.println("This area of the rectangle is:"+area);

		}
		public void show() {
			System.out.println("This is a rectangle.");
		}

}


