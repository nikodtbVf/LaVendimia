package Rockola;

import java.util.ArrayList;

public class DataSource {
	
	
	public static void fillDataArtist(ArrayList<Artist> artist) {
		Artist artist1 = new Artist(1, "Luis Miguel", 45);
		Artist artist2 = new Artist(2, "Ed Sheeran", 30);
		Artist artist3 = new Artist(3, "Los Angeles Azules", 0);	
		
		Album album1 = new Album(1, "Soy como quiero ser", 1987, 1);
		Album album2 = new Album(2, "México en la piel", 2005, 1);
		Album album3 = new Album(3, "Divide", 2017, 2);
		Album album4 = new Album(4, "X", 2014, 2);
		Album album5 = new Album(5, "Esto si es cumbia", 2018, 3 );
		Album album6 = new Album(6, "Como te voy a olvidar, Edición de Súper Lujo!", 2014, 3);
		
		
		Song s1 = new Song(1, "Ahora te puedes marchar", 200, 1);
		Song s2 = new Song(2, "Cuando calienta el sol", 160, 1);
		Song s3 = new Song(3, "Perdoname", 150, 1);
		
		Song s4 = new Song(4, "Échame a mi la culpa", 160, 2);
		Song s5 = new Song(5, "México en la piel", 190, 2);
		Song s6 = new Song(6, "Cielo Rojo", 210, 2);
		
		Song s7 = new Song(7, "Shape of you", 150, 3);
		Song s8 = new Song(8, "Eraser", 170, 3);
		Song s9 = new Song(9, "Dive", 180, 3);
		
		Song s10 = new Song(10, "Photograph", 160, 4);
		Song s11 = new Song(11, "Sing", 145, 4);
		Song s12 = new Song(12, "I'm a mess", 133, 4);
		
		Song s13 = new Song(13, "Perdón, Perdón", 160, 5);
		Song s14 = new Song(14, "Nunca es suficiente", 145, 5);
		Song s15 = new Song(15, "Me cuesta tanto olvidarte", 133, 5);
		
		Song s16 = new Song(16, "Como te voy a olvidar", 300, 6);
		Song s17 = new Song(17, "17 años", 225, 6);
		Song s18 = new Song(18, "Ay amor", 235, 6);
		
		album1.addSong(s1);
		album1.addSong(s2);
		album1.addSong(s3);
		album2.addSong(s4);
		album2.addSong(s5);
		album2.addSong(s6);
		album3.addSong(s7);
		album3.addSong(s8);
		album3.addSong(s9);
		album4.addSong(s10);
		album4.addSong(s11);
		album4.addSong(s12);
		album5.addSong(s13);
		album5.addSong(s14);
		album5.addSong(s15);
		album6.addSong(s16);
		album6.addSong(s17);
		album6.addSong(s18);
		
		artist1.addAlbum(album1);
		artist1.addAlbum(album2);
		artist2.addAlbum(album3);
		artist2.addAlbum(album4);
		artist3.addAlbum(album5);
		artist3.addAlbum(album6);
		
		artist.add(artist1);
		artist.add(artist2);
		artist.add(artist3);
	}
}
