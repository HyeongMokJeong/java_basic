package exercise_4;

class Song{
	String title;
	String artist;
	int year;
	String country;
	
	public Song() {}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.printf("%d년 %s국적의 %s가 부른 %s", this.year, this.country, this.artist, this.title);
	}
}

public class q3 {
	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();
	}
}
