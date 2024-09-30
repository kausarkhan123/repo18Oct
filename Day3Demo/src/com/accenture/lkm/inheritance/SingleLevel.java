package com.accenture.lkm.inheritance;
class A extends Object
{
	public A()
	{
		System.out.println("A initialized");
	}
}
class B extends A
{
	public B()
	{
		super(); //calling parent class constructor
		System.out.println("B initialized");
	}
}
public class SingleLevel {

	public static void main(String[] args) 
	{
		B ob=new B();
	}

}
