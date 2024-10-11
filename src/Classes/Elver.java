package Classes;

public class Elver {

    private String name;
    private Elver spouse;

    public Elver(String name) {
        this.name = name;
        this.spouse = null;
    }

    public Elver getSpouse() {
        return this.spouse;
    }
    private void setSpouse(Elver spouse) {
        this.spouse = spouse;
    }
    public void getMarriedTo(Elver anotherElver) {

        if (this.spouse != null) {
            this.divorcedTo();
        }
        if (anotherElver != null) {
            anotherElver.divorcedTo();
        }
        if (this == anotherElver) {
            System.out.println("You cannot marry yourself! Go' crazy first!");
        }
        this.setSpouse(anotherElver);
        anotherElver.setSpouse(this);
        System.out.println(this.name + " is now married to " + anotherElver.name);

    }
    public void divorcedTo() {

        if (this.spouse != null) {
            Elver divorcedSpouse = this.spouse;
            this.spouse.setSpouse(null);
            this.setSpouse(null);
            System.out.println(this.name + " is now divorced to " + divorcedSpouse.name);
        }
    }

}
