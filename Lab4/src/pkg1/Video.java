package pkg1;
import java.util.*;

public class Video extends MediaItem{
	private String director;
	private String genre;
	private int year;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	Scanner sc=new Scanner(System.in);
	public Video()
	{
		super();
		System.out.println("Enter director name:");
		setDirector(sc.next());
		System.out.println("Enter genre:");
		setGenre(sc.next());
		System.out.println("Enter year released:");
		setYear(sc.nextInt());
		
	}
	void print()
	{
		super.print();
		System.out.println("Director name:"+getDirector()+"\n"
				+ "Genre:"+getGenre()+"Year Released:"+getYear());
	}
	

}
