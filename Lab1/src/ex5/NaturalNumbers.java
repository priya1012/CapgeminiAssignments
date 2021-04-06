package ex5;

import java.util.Scanner;

public class NaturalNumbers {
	int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {

			if (i % 3 == 0 || i % 5 == 0) {
				//System.out.println(i + " ");
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		NaturalNumbers nn = new NaturalNumbers();
		System.out.println(nn.calculateSum(n));
        sc.close();
	}

}
