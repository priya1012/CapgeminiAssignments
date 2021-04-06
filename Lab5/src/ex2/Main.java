package ex2;

import java.util.*;

public class Main {
	static String firstname;
	static String lastname;

	public static void main(String[] args) throws NameException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name");
		firstname = sc.nextLine();
		System.out.println("Enter the last name");
		lastname = sc.nextLine();
		EmployeeFullName fn = new EmployeeFullName();
		fn.EmployeeName(firstname, lastname);

		sc.close();
	}

}