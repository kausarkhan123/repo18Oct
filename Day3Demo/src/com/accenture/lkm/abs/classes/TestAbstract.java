package com.accenture.lkm.abs.classes;
abstract class Abs1
{
	public Abs1()
	{
		System.out.println("Abs 1 initialized");
	}
	void m1()
	{
		System.out.println("Non abstract method");
	}
	abstract int compute(int x,int y); //abstract method
	abstract void showMessage(); //abstract method
	public static void staticMethod()
	{
		System.out.println("static method");
	}

}
class C extends Abs1
{

	public C()
	{
		System.out.println("Child class instantiated");
	}
	@Override
	int compute(int x, int y) 
	{
		int sum=0;
		sum=x+y;
		return sum;
	}

	@Override
	void showMessage() 
	{
		System.out.println("Greetings of the day");
	}
	
}
public class TestAbstract {

	public static void main(String[] args) 
	{
		//Abs1 ob=new Abs1();
		C ob=new C();
		ob.m1();
		System.out.println("Addition is: "+ob.compute(789, 345));
		ob.showMessage();
		//ob.staticMethod();
		Abs1.staticMethod();
	}

}
