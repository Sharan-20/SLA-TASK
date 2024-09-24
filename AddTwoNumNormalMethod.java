package com.index;
import java.util.Scanner;

public class AddTwoNumNormalMethod {
	public int Mul(int a,int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner =new Scanner(System.in);//create new scanner
		System.out.println("Enter a First Number: ");
		int num1=scanner.nextInt();
		System.out.println("Enter a Second Number: ");
		int num2=scanner.nextInt();
		
		AddTwoNumNormalMethod ad=new AddTwoNumNormalMethod();//create an obj
		int sum=ad.Mul(num1,num2);
		ad.Mul(num1,num2);
		System.out.println("The multiple of "+num1+" and"+ num2+" is:" +sum);
	}

}
