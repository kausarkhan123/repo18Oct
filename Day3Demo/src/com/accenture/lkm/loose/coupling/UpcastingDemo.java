package com.accenture.lkm.loose.coupling;
class A
{
	int i=10;
	void method1()
	{
		System.out.println("Method 1 of parent A");
	}
}
class B extends A
{
	int i=20;
	void method2()
	{
		System.out.println("Method 2 of child B");
	}
	@Override
	void method1()
	{
		//super.method1();
		System.out.println("Method 1 overridden in child class B: ");
	}
}
public class UpcastingDemo {

	public static void main(String[] args) 
	{
		A ob=new B(); //upcasting
		ob.method1();
		System.out.println(ob.i);
		
		//B downCastObj=(B) ob; //downcasting
		//downCastObj.method2();
	}

}
