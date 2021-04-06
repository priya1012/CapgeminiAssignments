package ex2;

import java.util.*;

public class CountChar {

	public static Map<Character, Integer> count(char[] ch) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else {
				map.put(ch[i], map.get(ch[i]) + 1);
			}
		}

		return map;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Vishnupriya";
		char[] ch = s.toCharArray();
		System.out.println(count(ch));
	}

}
