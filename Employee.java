package com.index;

public class Employee {
	//attributes
	String name;
	String job;
	String title;
	int salary;
	
	public Employee(String n,String j,String t,int s)
	{
		name=n;
		job=j;
		title=t;
		salary=s;
	}
	
	public void After(int newsal)
	{
		salary=newsal;
	}
	
	public void before()
	{
		System.out.println("Your name is: "+name);
		System.out.println("Your job is: "+job);
		System.out.println("your title is: "+title);
		System.out.println("your salary is: "+salary);
	}

	public static void main(String[] args) {

		Employee emp=new Employee("John","IT","Java",16000);
		emp.before();
		emp.After(32000);
		System.out.println("");
		System.out.println("After update Salary");
		emp.before();
	}

}
