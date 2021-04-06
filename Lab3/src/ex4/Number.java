package ex4;

import java.util.*;

public class Number {

	public static int modifyNumber(int num) {
		String s = Integer.toString(num);
		int len = s.length();
		int diff = 0;
		StringBuffer b = new StringBuffer();
		int i = 0;
		while (i < len - 1) {
			diff = Math.abs(Character.getNumericValue(s.charAt(i)) - (Character.getNumericValue(s.charAt(i + 1))));

			b.append(diff);

			i++;
		}
		b.append(s.charAt(len - 1));

		return Integer.parseInt(b.toString());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number:");
		int number = sc.nextInt();
		int result = modifyNumber(number);
		System.out.println(" New number:" + result);
		sc.close();
	}

}