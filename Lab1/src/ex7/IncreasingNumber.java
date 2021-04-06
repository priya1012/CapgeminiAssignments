package ex7;

import java.util.Scanner;

public class IncreasingNumber {
	boolean checkNumber(int n) {

		String check = String.valueOf(n);
		int len = check.length();
		for (int i = 0; i < len - 1; i++) {
			if (check.charAt(i) <= check.charAt(i + 1)) {
				continue;
			} else
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();
		// TODO Auto-generated method stub
		IncreasingNumber in = new IncreasingNumber();
		System.out.println(in.checkNumber(n));

		sc.close();

	}

}
