package Rockola;

import java.util.ArrayList;
import java.util.Scanner;
public class Rockola {

	private int selectedSong;
	private int selectedAlbum;
	private int selectedArtist;
	private boolean isPlayingMusic;
	private ArrayList<Artist> artist;
	private ArrayList<Song> queueSongs;
	Scanner scan;
	
	public Rockola() {
		this.selectedSong = -1;
		this.selectedAlbum = -1;
		this.selectedArtist = -1;
		this.queueSongs = new ArrayList<Song>();
		this.artist = new ArrayList<Artist>();
		this.queueSongs = new ArrayList<Song>();
		scan =  new Scanner(System.in);
	}
	
	public void init() {
		DataSource.fillDataArtist(artist);
		displayMenu();
	}
	
	public void displayMenu() {
		boolean playingMusic = true;
		
		while(playingMusic) {
			System.out.println("Seleccione una opción");
			System.out.println("1 : Mostrar Artistas");
			System.out.println("2: Mostrar Albums");
			System.out.println("0: Salir");
			
			int option = scan.nextInt();
			
			switch(option) {
				case 1:
					displayArtists();
					break;
				case 2:
					displayQueue();
					break;
				case 0:
					playingMusic = false;
					break;
				default:
					System.out.println("Opción Inválida. Intente nuevamente");
					break;
			}
			
		}
		System.out.println("Gracias por escuchar música con nosotros.");
	}
	
	public void displayArtists() {
		boolean displayArtists = true;
		while(displayArtists) {	
			this.selectedArtist = -1;
			for(int i = 0; i < this.artist.size(); i++ ) {
				Artist artist = this.artist.get(i);
				System.out.println( (i+1) + " - " + artist.getName());
			}
			
			System.out.println("0 - Salir");
			
			int option = scan.nextInt();
			if(option == 0) {
				displayArtists = false;
			}else if(option < 0 || option > this.artist.size()){
				System.out.println("Opción Inválida. Intente nuevamente");
			}else{
				this.selectedArtist = this.artist.get(option-1).getId();
				displayAlbums(this.artist.get(option-1).getAlbums());
			}
		}	
	}
	
	public void displayAlbums(ArrayList<Album> albumsByArtist) {
		boolean displayAlbums = true;
		
		while(displayAlbums) {
			this.selectedAlbum = -1;
			
			for(int i = 0; i < albumsByArtist.size(); i++) {
				Album album = albumsByArtist.get(i); 
				System.out.println( (i+1) + " - " +  album.getName() + " : Año - " + album.getYear());
			}
			System.out.println("0 - Salir");
			
			
			int option = scan.nextInt();
			if(option == 0) {
				displayAlbums = false;
			}else if(option < 0 || option > albumsByArtist.size()){
				System.out.println("Opción Inválida. Intente nuevamente");
			}else {
				this.selectedAlbum = albumsByArtist.get(option-1).getId();
				displaySongs(albumsByArtist.get(option-1).getSongs());
			}
		}	
	}
	
	public void displaySongs(ArrayList<Song> songs) {
		
		boolean displaySongs = true;
		
		
		while(displaySongs) {
			
			for(int i = 0; i < songs.size(); i++) {
				Song song = songs.get(i);
				System.out.println((i+1) + " - " +  song.getName() + " - Duración: " + song.getDuration());
			}
			
			System.out.println("0 - Salir");
			
			int option = scan.nextInt();
			if(option == 0) {
				displaySongs = false;	
			}else if(option < 0 || option > songs.size()){
				System.out.println("Opción Inválida. Intente nuevamente");
			}else {
				System.out.println("Escuchando ahora " + songs.get(option-1).getName());		
			}
		}
	}
	
	public void displayQueue() {
		
	}
}

