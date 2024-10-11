package Enum;

public class MusicTrack { //repræsenterer et musiknummer

//Egenskaberne for musiknummeret

    private String title, artist;
    private int rank;
    private Genre genre;

//Constructor for at initialisere attributterne
    public MusicTrack (String title, String artist, int rank, Genre genre) {
        this.title = title;
        this.artist = artist;
        this.rank = rank;
        this.genre = genre;
    }
//Metode til at printe ovenstående attributter ud og beskrivelsen for den valgte genre
    public void displayInfo() {
        System.out.println("Title: " + title +"\n"+
                "Artist: " + artist +"\n"+
                "Genre: " + genre +" "+ genre.getDescription() +"\n"+
                "Rank: " + rank +"\n"+
                "~~~~~~~~~~~~~~~~~~~~~~");
    }

}
