package ex8;

import java.util.Scanner;

public class Power {
	boolean checkNumber(int n) {
		if (n == 0)
			return false;
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();
		Power p = new Power();
		System.out.println(p.checkNumber(n));

		sc.close();
	}

}
