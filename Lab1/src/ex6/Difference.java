package ex6;

import java.util.*;

public class Difference {

	int calculateDifference(int n) {
		int diff = 0;
		int sum = 0;
		int sqsum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (i * i);
		}
		sqsum = sum * sum;
		diff = sqsum - sum;

		return diff;
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();
		Difference d = new Difference();
		System.out.println("The Difference is :" + d.calculateDifference(n));

		// TODO Auto-generated method stub
		sc.close();

	}

}
