package com.index;

public class Rectangle {
	
	double length;
	double height;	//instance variable 
	
	//constructor to initialize two values
	public Rectangle(double len,double hei)	
	{
		length=len;
		height=hei;
	}
	
	//method of return type
	public double Area()
	{
		return length*height;
		
	}
	
	//onather return type method
	public double Perimeter() 
	{
		 return 2*(length+height);
	}

	public static void main(String[] args) {
		
		Rectangle rect=new Rectangle(12.6,3.6);//create new obj and pass the value is called parameterized constructor
		System.out.println("The area is: "+rect.Area());
		System.out.println("The periemeter is: "+rect.Perimeter());
		rect.Area();
		rect.Perimeter();
		

	}

}
