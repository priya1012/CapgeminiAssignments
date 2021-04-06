package ex7;
import java.util.*;
import java.util.stream.*;

public class ReverseSorting {
	public ArrayList<Integer> getSorted(int arr[])
	{
		int r,n;
		for(int index=0;index<arr.length;index++)
		{
			int sum = 0;
			n=arr[index];
			while(n>0)
			{
				r = n%10;
				sum = sum * 10 + r;
				n = n/10;
			}
			arr[index] = sum;
		}
		ArrayList<Integer> list = 
				Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
		Collections.sort(list);
		return list;
		
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[]= {12,32,45,87,98,79};
	ReverseSorting rs = new ReverseSorting();
	for(Integer num : rs.getSorted(arr))
	{
		System.out.println(num);
	}
	

}
}


