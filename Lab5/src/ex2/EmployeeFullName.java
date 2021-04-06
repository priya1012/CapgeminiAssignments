package ex2;

public class EmployeeFullName {
	public void EmployeeName(String firstname,String lastname) throws NameException
	{
		
		try
		{
			if(firstname.isEmpty() && lastname.isEmpty())
			{
				throw new NameException("Names should not be blank");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}