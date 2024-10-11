package Enum;

public class Intro {
// Enum for different types of champagne
    enum ChampagneType {
        BRUT,
        EXTRA_DRY,
        SEC,
        DEMI_SEC,
        DOUX,
    }

    public static void main(String[] args) {
        //Select af champagne type
        ChampagneType myChampagne = ChampagneType.BRUT;

        // Display the selected champagne type
        System.out.println("The selected champagne type is " + myChampagne);


        //Du kan loope gennem alle champagnetyperne med foreach loop
        System.out.println("All champagne types:");
        for (ChampagneType type : ChampagneType.values()) {
            System.out.println(type);
        }
    }

}
