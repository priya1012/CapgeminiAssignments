package ex3;

import java.util.*;
import java.util.Map.*;

public class Squares {
	public void getSquares(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], arr[i] * arr[i]);
		}
		for (Entry<Integer, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 10, 15, 20, 25 };
		Squares sq = new Squares();
		sq.getSquares(arr);
	}

}
