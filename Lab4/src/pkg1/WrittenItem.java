package pkg1;
import java.util.*;

public class WrittenItem  extends Item{
	private String author;

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	Scanner sc=new Scanner(System.in);
	

	public WrittenItem() {
		
		super();
		System.out.println("Enter author Name:");
		setAuthor(sc.next());
		
	}

	public WrittenItem(int idno, int copies, String title,String author) {
		super(idno, copies, title);
		setAuthor(author);
		
	}
	public void print()
	{
		super.print();
		System.out.println("Author is:"+getAuthor());
	}

}
