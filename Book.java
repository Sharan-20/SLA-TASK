package com.index;
public class Book {
	String title;
	String author;		//instance variable
	int price;
	
	//default constructor
	public Book() {
		title="null";
		author="null";
		price=0;
		
	}
	
	//constructor 2 pass argument two title and author
	public Book(String tit,String aut)
	{
		title=tit;
		author=aut;
		price=1800;
	}
	
	//constructor3 have three parameters title,author,price
	public Book(String tit,String aut,int pri)
	{
		title=tit;
		author=aut;
		price=pri;
	}
	
	//display the values of book
	void display() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
		System.out.println();
	}

	public static void main(String[] args) {
		//default constructor
		Book bk=new Book();
		
		//parameterized constructor
		Book bk1=new Book("Harry Potter","Mitghun",1904);
		Book bk2=new Book("The snow"," Housel",22200);
		bk.display();
		bk1.display();
		bk2.display();
		

	}

}
