package ex6;

import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string.");
		String str = sc.nextLine();

		int n = str.length();
		char[] str1 = new char[n];
		for (int i = 0; i < n; i++) {
			str1[i] = str.charAt(i);
		}
		
		char temp;
		char str2[] = new char[n];
		for (int i1 = 0; i1 < n; i1++) {
			str2[i1] = str1[i1];
		}

		for (int i1 = 0; i1 < n - 1; i1++) {
			if (str1[i1] <= str1[i1 + 1]) {
				continue;
			} else {
				temp = str1[i1];
				str1[i1] = str1[i1 + 1];
				str1[i1 + 1] = temp;
			}
		}

		int value = 0;
		for (int j = 0; j < n; j++) {
			if (str1[j] == str2[j]) {
				value = 1;

			} else {
				value = 0;
				break;

			}
		}

		if (value == 1) {
			System.out.println(" positive string.");
		} else {
			System.out.println("not a positive string.");
		}
		sc.close();

	}

}