package ex4;

import java.util.HashMap;
import java.util.Map.Entry;

public class StudentMedal {
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

	public void getStudents() {
		for (Entry<Integer, Integer> m : hm.entrySet()) {

			if (m.getValue() >= 90) {
				hm1.put(m.getKey(), "Gold");
			} else if (m.getValue() >= 80 && m.getValue() < 90) {
				hm1.put(m.getKey(), "Silver");
			} else if (m.getValue() >= 70 && m.getValue() < 80) {
				hm1.put(m.getKey(), "Bronze");
			}

		}
		for (Entry<Integer, String> m : hm1.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

	}

	public void createHashmap() {
		hm.put(101, 90);
		hm.put(102, 85);
		hm.put(103, 75);
		hm.put(104, 65);
		hm.put(105, 55);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMedal sm = new StudentMedal();
		sm.createHashmap();
		sm.getStudents();

	}
}
