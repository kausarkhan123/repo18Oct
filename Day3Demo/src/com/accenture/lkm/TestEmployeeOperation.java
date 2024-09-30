package com.accenture.lkm;

public class TestEmployeeOperation {

	public static void main(String[] args)
	{
		Employee e=new Employee(1001,"Karan",34000.0);
		Employee e1=new Employee(1002,"Ravitha",84000.0);
		Employee e2=new Employee(1003,"Meera",90000.0);
		Employee e3=new Employee(1004,"Sheena",78000.0);
		Employee e4=new Employee(1005,"Raghav",34000.0);
		
		Employee emp[]=new Employee[5]; //Created an empty array of employee with 5 blocks
		emp[0]=e;
		emp[1]=e1;
		emp[2]=e2;
		emp[3]=e3;
		emp[4]=e4;
		EmployeeOperation operation=new EmployeeOperation(emp);
		operation.printEmployee();
		System.out.println("Total Count of Employees: "+operation.getCount());
		
		
		
		
		
		
	}

}
