package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class SongMenu {

    /* Instantierer ArrayList af klassen "Song", som indeholder titel. Static fordi songList skal bruges og deles
    af alle instanser af klassen = én delt kopi uagtet antal objekter, der oprettes af klassen.
    Uden for main = ArrayList-variablen erklæres her som et klassemedlem/feltvariabel = tilgængelig for hele klassen +
    andre klasser (fordi den er public).
     */

    //public static ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        ArrayList<Song> songList = new ArrayList<Song>();

        Scanner input = new Scanner(System.in); //importerer scanner, så program kan modtage bruger-input fra konsollen

        boolean playing = true; //så Spotify kan afsluttes
        System.out.println("Velkommen til Spotify!"); //skrives uden for while-loopet, så denne besked kun optræder én gang.

        while (playing) { //spørger bruger, hvad denne ønsker at vælge

            System.out.println(""" 
                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                    Du har nu flg. valgmuligheder:
                    1 - Tilføje sangtitel
                    2 - Slette sangtitel
                    3 - Se alle sangtitler
                    4 - Søge efter sangtitel
                    5 - Ændre sangtitel
                    6 - Afslutte""");
            int choice = input.nextInt(); //gemmer bruger-input i int-variablen "choice"
            input.nextLine(); //Forbruger det resterende linjeskift fra int-inputtet, således bruger kan indtaste String-værdi.

            switch (choice) { //bruger switch til at følge op på første valgmulighed til brugeren

                case 1:
                    System.out.println("Hvilken sangtitel ønsker du at tilføje?");
                    String addSongTitle = input.nextLine(); //gemmer bruger-valgt sangtitel i variabel
                    songList.add(new Song(addSongTitle)); //Tilføjer ny sangtitel til songList, som oprettes pba. Klassen "Song"
                    System.out.println("Du har nu tilføjet: [" + addSongTitle + "] til din Spotify!");
                    break;

                case 2:
                    boolean foundSong = false;
                    System.out.println("Hvilken sangtitel ønsker du at slette?");
                    String deleteSongTitle = input.nextLine(); //gemmer den slettede sangtitel i String variabel "deleteSongTitle"
                    //For at tjekke om sangen er der, skal jeg iterere igennem den med loop

                    /* for (Song songSearch : songList) { FOREACH LOOP
                        if (songSearch.getTitle().equalsIgnoreCase(deleteSongTitle)) {
                        }*/

                    for (int i = 0; i < songList.size(); i++) { //itererer gennem "songList" indtil dennes størrelse .size()
                        if (songList.get(i).getTitle().equalsIgnoreCase(deleteSongTitle)) {
                        /* songList.get(i) = henter elementet på indeks (i) i songList, som er et objekt af Song-klassen.
                        .getTitle() henter metode til at give titlen på den sang på det specifikke indeks, og sammenligner med
                        den sangtitel, som brugeren angiver med.equals(deleteSongTitle)
                        = hvis sangen ikke er der, kan den jo ikke slettes.
                        */
                            songList.remove(i); //sletter elementet via indeksnummer (i), som danner værdi alt efter hvilket indeksnummer den pågældende sang har.
                            System.out.println("Du har nu slettet [" + deleteSongTitle + "] fra din Spotify!");
                            foundSong = true;
                            break; //bryder kun ud af loopet, når sangen er blevet fundet og slettet = sikrer at programmet ikke springer nogle elementer over.
                        }
                    }
                    //kan ikke bruge "else" da det afbryder loopet, hvis den første sang ikke matcher = itererer ikke gennem hele listen så.
                    if (!foundSong) { //if skal være uden for loopet, så loopet kører færdigt inden den meddeler, at sangen ikke findes på listen.
                        System.out.println("Sangen [" + deleteSongTitle + "] er ikke på din Spotify.");
                    }
                    break;

                case 3:

                    if (songList.isEmpty()) {
                        System.out.println("Du har ingen tilføjede sange på din Spotify!");
                        break;

                    } else {
                        System.out.println("Flg. sange er på din Spotify:");

                        for (int i = 0; i < songList.size(); i++) { //Itererer gennem songList
                            //printer sangene fra indeksnumrene fra "songList" ud, som for-loopet lige har itereret
                            System.out.println(songList.get(i));
                        }
                        break; /*Der skal ikke være "break" inde i for-loopet, da den så vil slutte efter én iteration
                        = fordi den ikke har en slutbetingelse. Den tæller blot listen, og skal altså ikke stoppe efter én
                        iteration.
                        */
                    }

                case 4:
                    System.out.println("Hvilken sang vil du gerne finde?");
                    String songTitleSearch = input.nextLine();
                    boolean songTitleFound = false;

                    for (int i = 0; i < songList.toArray().length; i++) { //.toArray().length er det samme som .size()

                        if (songList.get(i).getTitle().equalsIgnoreCase(songTitleSearch)) {
                            System.out.println("Den angivne sang [" + songTitleSearch + "] er på din Spotify!");
                            songTitleFound = true;
                            break;
                        }
                    }
                    if (!songTitleFound) { //uden for for-loop, så den itererer listen færdig.
                        System.out.println("Den angivne sang [" + songTitleSearch + "] er ikke på din Spotify!");
                        break;
                    }
                    break;



                case 5:

                    System.out.println("Hvilken sang vil du gerne ændre titlen på?");
                    String songTitleToChange = input.nextLine();
                    boolean foundSongTitle = false;

                    for (int i = 0; i < songList.size(); i++) {

                        if (songList.get(i).getTitle().equalsIgnoreCase(songTitleToChange)) {
                            //hvis sangtitlen er lig med sangtitlen på indeksnummer (i), kan sangtitlen redigeres
                            System.out.println("Til hvilken titel skal sangen ændres?");
                            String newSongTitle = input.nextLine(); //gemmer ny sangtitel
                            //henter det specifikke indeksnummer fra sanglisten, så den nye titel kan "settes"
                            songList.get(i).setTitle(newSongTitle);
                            System.out.println("Sangtitlen [" + songTitleToChange + "] er nu ændret til " + newSongTitle);
                            foundSongTitle = true;
                            break;
                        }
                    }
                    if (!foundSongTitle) {
                        System.out.println("Sangtitel [" + songTitleToChange + "]" +
                                " er ikke at finde på din Spotify!");
                        break;
                    }
                    break; //break uden for case 5 og inden case 6, således den ikke afslutter program efter den har læst case 5

                case 6:
                    System.out.println("Din Spotify lukkes nu ned. Med ønske om en god dag!");
                    playing = false;
                    break;


            }

        }

        }

    }







