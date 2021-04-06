package com.cg.eis.exception;


public class EmployeeSalary {
	public void employeesalary(int salary) throws EmployeeException
	{
		try
		{
			if(salary<3000)
			{
				throw new EmployeeException("Salary of an Employee is less than 3000");
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}