package ex5;

import java.util.*;
import java.util.stream.*;

public class SecondSmallest {
	public int getSecondSmallest(int arr[]) {

		ArrayList<Integer> listOfLong = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
		Collections.sort(listOfLong);
		return listOfLong.get(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 8, 6, 7, 1, 2 };
		SecondSmallest ss = new SecondSmallest();
		System.out.println(ss.getSecondSmallest(arr));

	}

}
