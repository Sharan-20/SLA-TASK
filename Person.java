package com.index;

public class Person {
	//instance variable
	String name;
	int age;
	
	public Person(String n,int a) 
	{
		name=n;
		age=a;
	}
	
	void display()
	{
		System.out.println("Your name is: "+name);
		System.out.println("Your name is: "+age);
	}

	public static void main(String[] args) {
		Person p=new Person("Mohan",23);
		p.display();
		

	}

}
