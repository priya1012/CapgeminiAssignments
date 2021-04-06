package ex2;

import java.util.Scanner;

public class MirrorImage {
	String getImage(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		return s + "|" + reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.next();
		MirrorImage m1 = new MirrorImage();
		System.out.println(m1.getImage(s));
		sc.close();
	}

}
