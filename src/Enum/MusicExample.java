package Enum;

public class MusicExample {

    public static void main(String[] args) {
    //Instantierer 5 musiknumre/objekter og tilføjer argumenterne til konstruktøren
        MusicTrack song1 = new MusicTrack("Illusion", "Dua Lipa", 1, Genre.POP);
        MusicTrack song2 = new MusicTrack("Here for you", "King Akintayo", 2, Genre.ROCK);
        MusicTrack song3 = new MusicTrack("Million Dollar Baby", " Tommy Richman", 3, Genre.R_AND_B);
        MusicTrack song4 = new MusicTrack("Houdini", "Eminem", 4, Genre.HIP_HOP);
        MusicTrack song5 = new MusicTrack("I had some help", "Post Malone", 5, Genre.COUNTRY);

        song1.displayInfo();
        song2.displayInfo();
        song3.displayInfo();
        song4.displayInfo();
        song5.displayInfo();

    }
}
