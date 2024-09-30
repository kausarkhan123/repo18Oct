package com.accenture.lkm.inheritance;

public class TestInhertance {

	public static void main(String[] args) 
	{
		Employee e=new Employee(1, "Ram", 67000, "Dev");
		e.display();
		
		System.out.println();
		
		Employee e2=new Employee();
		e2.display();
			}

}
