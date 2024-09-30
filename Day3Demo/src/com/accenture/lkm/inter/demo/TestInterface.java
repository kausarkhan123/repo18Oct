package com.accenture.lkm.inter.demo;

public class TestInterface extends Z implements Calculator,PrintInterface
{

	public static void main(String[] args) 
	{
		//TestInterface t=new TestInterface();
		//int result=t.compute(67, 2);
		//t.print(result);
		//Calculator.staticMethod();
		//t.show();
		//t.hello();
		//Calculator c=new Calculator();//not allowed
		System.out.println(Calculator.num);
		
		
		
		
	}

	@Override
	public int compute(int x, int y) 
	{
		int cal=0;
		cal=x*y;
		return cal;
	}

	@Override
	public void print(Object data) 
	{
		System.out.println(data);
	}

}
