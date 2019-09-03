package Rockola;

import java.util.ArrayList;

public class Album {
	
	private int id;
	private String name;
	private int year;
	private int artistId;
	private ArrayList<Song> songs;
	
	public Album(int id, String name, int year, int artistId) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.artistId = artistId;
		songs = new ArrayList<Song>();
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	
	public void addSong(Song song) {
		this.songs.add(song);
	}
	
	public ArrayList<Song> getSongs(){
		return this.songs;
	}
}
