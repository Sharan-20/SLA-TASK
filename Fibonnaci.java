package com.index;
import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scanner.nextInt();
		int a=-1,b=1,c;
		for(int i=1;i<=num;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		

	}

}
