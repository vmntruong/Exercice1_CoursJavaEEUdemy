package corecom.directmedia.onlinestore.core.entity;

public class Work {
	private String title;
	private String genre;
	// année de release
	private int release;
	private String summary;
	private Artist mainArtist;
	
	public Work(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Artist getMainArtist() {
		return mainArtist;
	}
	public void setMainArtist(Artist mainArtist) {
		this.mainArtist = mainArtist;
	}
	
}
