package ex3;

import java.util.Scanner;
import java.util.Arrays;

public class Reverse {

	public int[] getSorted(int[] a) {
		int[] result = new int[a.length];
		int j = 0;
		int i = 0;
		for (i = a.length; i > 0; i--, j++) {
			result[j] = a[i - 1];
			System.out.print(result[j] + " ");

		}

		Arrays.sort(result);

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size = sc.nextInt();
		int[] a = new int[size];

		System.out.println("Enter the elements in the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		Arrays.toString(a);
		// TODO Auto-generated method stub
		Reverse r = new Reverse();
		System.out.println(r.getSorted(a));
		sc.close();
	}

}
