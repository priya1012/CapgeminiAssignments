package ex4;
import java.util.*;

public class Duplicate {
	
	 public  static int[] modifyDuplicate(int[] a) {
		int j=0;
		int[] result = new int[a.length];
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[j]) {
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		for(int i=j;i>0;i--) {
			System.out.println(a[i]);
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,20,33,55,10,20,48,45,88,69};
		modifyDuplicate(a);
		

	}

}
