package Rockola;

import java.util.ArrayList;

public class Artist {
	
	private int id;
	private String name;
	private int age;
	private ArrayList<Album> albums;
	
	public Artist(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.albums = new ArrayList<Album>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void addAlbum(Album album) {
		this.albums.add(album);
	}
	
	public ArrayList<Album> getAlbums(){
		return this.albums;
	}
}
