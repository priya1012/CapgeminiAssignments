package ex1;

import java.util.*;

public class SortHashMap {
	Map<String, Integer> map = new HashMap<String, Integer>();

	public void getValue() {
		map.put("Arun", 10001);
		map.put("Buddha", 10002);
		map.put("Senorita", 10003);
		map.put("Ajith", 10004);
		map.put("Sam", 10007);
		map.put("Rekha", 10006);

	}

	public void sorthashmap() {
		Collection<Integer> values = map.values();
		List<Integer> listValues = new ArrayList<Integer>(values);
		Collections.sort(listValues);
		for (Integer value : listValues) {
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		SortHashMap sh = new SortHashMap();
		sh.getValue();
		sh.sorthashmap();

	}

}
