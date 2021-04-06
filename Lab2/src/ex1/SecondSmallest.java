package ex1;

import java.util.Scanner;

public class SecondSmallest {

	int getSecondSmallest(int[] a) {
		int res=0;
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					min = a[i];
					a[i] = a[j];
					a[j] = min;	
				}
				res=a[1];
			}

		}
		return res;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		 int size = sc.nextInt();
		 int[] a = new int[size];
		System.out.println("Enter the elements in the array");
		for (int i = 0; i <a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
		}
		
		
         SecondSmallest ss = new SecondSmallest();
		System.out.println("Second Smallest number:"+ss.getSecondSmallest(a));
		
		sc.close();

	}


}
