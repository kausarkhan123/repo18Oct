package com.accenture.lkm.inheritance;

public class Employee extends User
{
private int salary;
private String designation;
	public Employee(int id, String name,int salary, String designation)
	{
		super(id, name); //caling parent constructor	
		this.salary=salary;
		this.designation=designation;
		
	}
	
public Employee()
{
	System.out.println("Employee Initialzed");
}
@Override
void display()
{
	System.out.println(" "+id+" "+name+" "+salary+" "+designation+" Code: "+code);
}
/*@Override
static void showSomething()
{
	System.out.println("Hiiiii... ");
}
*/	
}
