package ex3;

import java.util.*;
import java.util.Map.*;

public class Squares {
	public void getSquares(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int arrindex = 0; arrindex < arr.length; arrindex++) {
			hm.put(arr[arrindex], arr[arrindex] * arr[arrindex]);
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
