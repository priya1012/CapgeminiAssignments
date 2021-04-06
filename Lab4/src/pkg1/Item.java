package pkg1;
import java.util.*;

public abstract class Item {
	private int idno;
	private int copies;
	private String title;
	public Item(int idno, int copies, String title) {
		this.idno = idno;
		this.copies = copies;
		this.title = title;
	}
	
	
	public int getIdno() {
		return idno;
	}
	
	public void setIdno(int idno) {
		this.idno = idno;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
public Item() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id number:");
	setIdno(sc.nextInt());
	System.out.println("Enter title:");
	setTitle(sc.next());
	System.out.println("Enter number of copies:");
	setCopies(sc.nextInt());
	sc.close();
	}
void print()
{
	System.out.println("id:"+getIdno()+"\n"
			+ "title:"+getTitle()+"\n"
					+ "copies:"+getCopies());
}

}
