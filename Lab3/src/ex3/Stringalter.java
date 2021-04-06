package ex3;

import java.util.Scanner;

public class Stringalter {
	private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
	private static String alterString(String input) {
	    char[] chars = input.toCharArray();
	    for (int i = 0; i < chars.length; i++) {
	        char ch = chars[i];
	        char lower = Character.toLowerCase(ch);
	        int idx = CONSONANTS.indexOf(lower);
	        if (idx != -1) {
	            char next = CONSONANTS.charAt((idx + 1) % CONSONANTS.length());
	            chars[i] = (ch == lower ? next : Character.toUpperCase(next));
	        }
	    }
	    return new String(chars);
	}

		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String input = sc.next();
		System.out.println(alterString(input));
		sc.close();

	}

}
