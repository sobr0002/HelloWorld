package Classes;

public class Human {

    private String name;
    private Human spouse;


    public Human(String name) {
        this.name = name;
        this.spouse = null;
    }

    public Human getSpouse() {
        return this.spouse;
    }

    private void setSpouse(Human spouse) {
       this.spouse = spouse;
    }

    public void marryTo(Human anotherSpouse) {

        if (this == anotherSpouse) {
            System.out.println("Find someone to get married to!");
        }
        if (this.spouse != null) {
            this.divorcedTo();

        }
        if (anotherSpouse.getSpouse() != null) {
            anotherSpouse.divorcedTo();

        }
        this.setSpouse(anotherSpouse);
        anotherSpouse.setSpouse(this);
        System.out.println(this.name + " is now married to " + anotherSpouse.name);

    }

    public void divorcedTo() {

        if (this.spouse != null) {
            Human previousSpouse = this.spouse;
            this.spouse.setSpouse(null);
            this.setSpouse(null);
            System.out.println(this.name + " is now divorced to " + previousSpouse.name);
        }
    }


}
