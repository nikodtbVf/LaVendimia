package Rockola;

public class Song {
	
	private int id;
	private String name;
	private int duration;
	private int albumId;
	
	public Song(int id, String name, int duration, int albumId) {
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.albumId = albumId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
}
