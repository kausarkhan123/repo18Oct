package com.accenture.lkm.inheritance;

public class User 
{
int id;
String name;
final int code=1000;
public User(int id, String name) 
{
	super();
	this.id = id;
	this.name = name;
	System.out.println("User Initialized");
}
public User() 
{
	super();
	System.out.println("User Initialized without para");
}
void display()
{
	System.out.println(id+" "+name);
}
static void showSomething()
{
	System.out.println("Hello, greetings of the day!!!");
}
}
