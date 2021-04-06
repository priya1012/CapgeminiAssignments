package ex1;

public class ValidateAge  {
	public void validateage(int age) throws AgeException
	{
		try
		{
			if(age<=15)
			{
				throw new AgeException(" Age of a person should be above 15.");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}