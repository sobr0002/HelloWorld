package ArrayList;

public class Song {

    private String title;

    public Song(String title) { //Initialiserer titel
        this.title = title;
    }

    public String getTitle() { //getter() for at kunne kalde titlen
        return title;
    }
    public void setTitle(String title) { //setter() for at kunne assigne værdi til titel
        this.title = title;
    }
@Override
    public String toString() {
        return "Sangtitlen: " + title;
    }



}
