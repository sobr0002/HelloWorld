package Classes;

public class Menneske {

    private String navn;
    private Menneske ægtefælle;

    //Constructor til initialisering. Nu kan et menneske oprettes med navn. Et nyt menneske har ikke nogen ægtefælle.
    public Menneske(String navn) {
        this.navn = navn;
        this.ægtefælle = null; //ingen ægtefælle fra starten.
    }
    //Getter returnerer den nuværende ægtefælle (hvis ingen = null). Dvs. Tjekker om personen er gift.
    public Menneske getÆgtefælle() {
        return ægtefælle;
    }

    // Setter ny værdi for ægtefælle. Private = kan kun ændres via metoder.
    private void setÆgtefælle(Menneske ægtefælle) {
        this.ægtefælle = ægtefælle;
    }

    public void gifterSigMed(Menneske andenPerson) {

        //Tjekker om personen ("this" = en selv) er ved at gifte sig med sig selv.
        if (this == andenPerson) {
            System.out.println("Find én at blive gift med");
        }

        //Tjekker om personen allerede er gift.
        if (this.ægtefælle != null) {
            this.bliverSkilt(); //kalder metode, så personen bliver skilt.
        }
        if (andenPerson.getÆgtefælle() != null) {
            andenPerson.bliverSkilt(); //den anden person skal også skilles, hvis denne er gift.
        }
        //
        this.setÆgtefælle(andenPerson);
        andenPerson.setÆgtefælle(this);
        System.out.println(this.navn + " er nu gift med " + andenPerson.navn);
    }

    public void bliverSkilt() {
        if (this.ægtefælle != null) {
            Menneske fraskiltPerson = this.ægtefælle;
            this.ægtefælle.setÆgtefælle(null);
            this.setÆgtefælle(null);
            System.out.println(this.navn + " er nu skilt fra " + fraskiltPerson.navn);
        }
    }
}







