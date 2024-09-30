package com.accenture.lkm.inter.demo;

public interface Calculator 
{
int compute(int x,int y);//abstract method
public static final int num=10; //constant
int num2=8; //both are same -- constant
default void show()
{
	System.out.println("default method");
}
static void staticMethod()
{
	System.out.println("Static method");
}
}
