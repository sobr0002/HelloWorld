package Aflevering;
import java.lang.Math;

public class Tamagotchi {

    protected String name, sound;
    protected double health, hours;
    protected int age, mood, energy, food;
    protected boolean love, dirty;

    //Constructor
    public Tamagotchi (String name) {
        this.name = name;
        this.age = 0;
        this.health = 50;
        this.mood = (int) (Math.random() * 10);
        this.energy = (int) (Math.random() * 10);
        this.love = false;
        this.sound = null;
        this.dirty = false;
        this.hours = 0;
        this.food = 5;
    }

    public void howOld() { //Beregner dyrets alder
        age = (int) (hours / 24); //runder doubles
    }

    public void sleep(int hoursOfSleep) { //hvor meget skal dyret sove?

        if (energy < 100) {
            energy += hoursOfSleep;
            mood +=1;
            food -= hoursOfSleep * 0.5; //dyret bliver halvt så træt som den spiser
            health += hoursOfSleep * 2; //dyret bliver dobbelt så sund, når den sover
        } else {
            System.out.println(name + " er ikke træt. Giv den stimuli! <3");
        }
        checkLimits(); //Tjekker at dyret ikke sover over sig

    }
    public void food() { //Er dyret sulten?

        if (food < 10) {
            food = 10;
            health += 20;
            dirty = true;
            hours += 1;
        }
        if (health == 100) {
            System.out.println(name + " er 100 % sund!");
        }
        checkLimits(); //Tjekker at dyret ikke spiser for meget

    }
    public void medicine(boolean antibiotics) { //Hvor syg er dyret?

        if (health < 30) {
            System.out.println(name + " er hammer syg!");
            if (antibiotics == true) {
                health = 100;
                mood += 70;
            }
        }
     else if (health >= 30 && health < 70) {
            System.out.println(name + " er halt.");
            if (antibiotics == true) {
                health = 100;
                mood += 24;
            }
        }
     else {
            System.out.println("Du har bare en rigtig sund " + name + "!");
        }
     checkLimits(); //Tjekker at dyret ikke bliver for sund

    }
    public void cleaning(int clean) { //Er du snavset? Vi vasker dig

        int howClean = 0;

        switch (clean) {
            case 1:
                System.out.println("poter");
                howClean += 3;
                break;
            case 2:
                System.out.println("numse");
                howClean += 4;
                break;
            case 3:
                System.out.println("mundtøjet");
                howClean += 2;
                break;
            case 4:
                System.out.println("mavsi");
                howClean += 3;
                break;
        }
        if (howClean >= 8) {
            dirty = false;
            clean = 0;
        }
    }
    public void play(int number) {

        switch (number) {
            case 1:
                System.out.println("Syng for " + name + " <3");
                mood += 3;
                food -= 1;
                energy -= 15;
                hours += 0.33;
                break;
            case 2:
                System.out.println("Løb en tur med " + name + " <3");
                mood += 4;
                food -= 1;
                energy -= 15;
                hours += 0.5;
                break;
            case 3:
                System.out.println("Dans med " + " <3");
                mood += 2;
                food -= 1;
                energy -= 15;
                hours += 0.5;
                break;
            case 4:
                System.out.println("Sejl" + name + " til Norge <3");
                mood += 5;
                food -= 1;
                energy -= 20;
                hours += 96;
        }
        dirty = true;

    }
    // Dyret siger en lyd
    public void makeSound() {
        System.out.println(name + " siger");

    }

    public void love() {

        if (mood > 380 && food > 8 && energy > 60 && health > 70) {
            love = true;
        }
    }
    public void death() {

        if (energy < 5) {
            System.out.println("Din " + name + " er leget til døde!");

        } else if (mood < 5) {
            System.out.println("Din " + name + " var for ked af det til at leve..");
        } else if (health < 5) {
            System.out.println("Din " + " er død af helbredsmæssige årsager.");
        } else if (food == 0) {
            System.out.println("Din " + name + " døde af sult");
        }
        dirty = true;
    }

    public void checkLimits() { //Tjekker om variabler holdes inden for fastsat grænse
        this.health = Math.min(100, Math.max(0, this.health)); //Tager det mindste tal af 100 og det største tal af 0)
        this.food = Math.min(10, Math.max(0, this.food));
        this.mood = Math.min(100, Math.max(0, this.mood));
        this.energy = Math.min(100, Math.max(0, this.energy));
    }

    public String toString() {
        return "Din Tamagotchi hedder: " + name + "og er " + age + " år\n" +
                "Humøret er " + mood + "/100 \n" +
                "Helbredsstatus er " + health + "/100\n" +
                "Energiniveauet er på " + energy + "/100\n" +
                "Den er " + dirty + "ren\n" +
                "Dens mavesæk er " + food + "/10 fyldt og siger: " + sound + "\n" +
                "Kærligheden er :" + love;

    }
    public String getName() {
        return this.name;
    }
    public void setName() {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge() {
        this.age = age;
    }
    public int getMood() {
        return this.mood;
    }
    public void setMood() {
        this.mood = mood;
    }
    public double getHealth() {
        return this.health;
    }
    public void setHealth() {
        this.health = health;
    }
    public int getEnergy() {
        return this.energy;
    }
    public void setEnergy() {
        this.energy = energy;
    }
    public String getSound() {
        return this.sound;
    }
    public void setSound() {
        this.sound = sound;
    }
    public boolean getLove() {
        return this.love;
    }
    public void setLove() {
        this.love = love;
    }
    public boolean getDirty() {
        return this.dirty;
    }
    public void setDirty() {
        this.dirty = dirty;
    }
    public int getFood() {
        return this.food;
    }
    public void setFood() {
        this.food = food;
    }


}
