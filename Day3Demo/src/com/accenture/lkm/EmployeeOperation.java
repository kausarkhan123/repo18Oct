package com.accenture.lkm;

public class EmployeeOperation 
{
Employee employees[];//member variable ---null has a relationship

public EmployeeOperation(Employee employees[])
{
 this.employees=employees; //assigning array of employee object
}
public void printEmployee()
{
	for(Employee e:employees)
	{
		System.out.println(" "+e.getEmpId()+" "+e.getEmpName()+" "+e.getSalary());
	}
}

public int getCount()
{
	int counter=0;
	for(Employee e:employees)
	{
		counter++;
	}
	return counter;
}
}
