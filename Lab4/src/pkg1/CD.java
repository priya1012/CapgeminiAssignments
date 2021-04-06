package pkg1;
import java.util.*;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	Scanner sc=new Scanner(System.in);
	public CD()
	{
		super();
		System.out.println("Enter the artist name:");
		setArtist(sc.next());
		System.out.println("Enter genre:");
		setGenre(sc.next());
		
	}
	void print()
	{
		super.print();
		System.out.println("Artist:"+getArtist()+"\n"
				+ "Genre:"+getGenre());
	}

}
