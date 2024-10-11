package Enum;

/* Laver enum genre og tilføjer descriptive attribute til hver
attributten er tilføjet som en description String i ()
Enum er ikke i en klasse i dette tilfælde.
 */
    public enum Genre {
        POP("er afledt af ordet populær. Musikken er karakteriseret ved at være flydende og foranderlig."),
        ROCK("er karakteriseret ved rytmisk musik med trommer, guitar og en eller flere forsangere"),
        HIP_HOP("er karakteriseret som stiliseret rytmisk musik og ledsager ofte rap"),
        R_AND_B("står for \"rhythm and blues\" og er en blanding af blues og noget rytmisk"),
        COUNTRY("indeholder fortællekunst, som typisk beskriver livet på landet");

        private String description; //gemmer beskrivelsen i en variabel, der hedder "description"

        Genre(String description) {  //Constructor for at assigne beskrivelserne
            this.description = description;
        }

        public String getDescription() { //Returnerer beskrivelsen for én bestemt enum-værdi
            return description;
        }
    }

