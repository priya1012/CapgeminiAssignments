package pkg1;
import java.util.*;
public class MediaItem  extends Item{
	private int runtime;
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	Scanner sc=new Scanner(System.in);
	public MediaItem()
	{
		super();
		System.out.println("Enter runtime:");
		setRuntime(sc.nextInt());
	}
	void print()
	{
		super.print();
		System.out.println("Runtime is:"+getRuntime());
	}
	

}
