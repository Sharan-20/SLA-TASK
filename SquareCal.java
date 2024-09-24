package com.index;

public class SquareCal {
	public void printSquare(int num) {
		int square=num*num;
		System.out.println(square);
		
	}

	public static void main(String[] args) {
		
		SquareCal squarecal=new SquareCal();//create the new obj
		squarecal.printSquare(6);//call the obj and pass the value into the parameter
		
		
	}

}
