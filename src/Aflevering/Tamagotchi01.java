package Aflevering;
import java.util.Random;
public class Tamagotchi01 {


    private String name;
    protected String sound;
    private int age, hunger, energy, care, love, userInputCount;


    public Tamagotchi01(String name) {
        Random random = new Random();
        this.name = name;
        this.sound = ""; //initialiserer sound
        this.age = 0;
        this.hunger = (int) (Math.random() * (10 + 1));
        this.energy = random.nextInt(10);
        this.care = random.nextInt(10);
        this.love = random.nextInt(10);
        this.userInputCount = 0; //initialiserer user input count
    }

    public void tick() {
        userInputCount++;

        if (userInputCount == 3) {
            age++; //øger dyrets alder med et år
            userInputCount = 0; //nulstiller tæller
            System.out.println(getName() +  " har fødselsdag i dag! Den bliver " + age + " år!");

            if (age > 4) {
                System.out.println(getName() + " er fløjet til dyrehimlen!");
            }
        }
    }
    public void sleep() {
        if (energy < 6) {
            System.out.println(name + " er pivtræt!");
        } else {
            System.out.println(name + " er ikke træt. Giv den stimuli! ❤\uFE0F");
        }
        energy += 2;
        care -= 2;
        love += 2;
        tick();
        checkLimits();

    }

    public void feed() {
        if (hunger < 6) {
            System.out.println(name + " har fået dejlig mad!");
        } else {
            System.out.println(name + " er godt fyldt i mavsen!");
        }
        hunger += 2;
        energy -= 2;
        care -= 3;
        love += 3;
        tick();
        checkLimits();

    }

    public void getClean() {
        if (care < 6) {
            System.out.println(name + " er stadigvæk lidt snavset! \uD83D\uDCA9");
        } else {
            System.out.println(name + " er simpelthen så ren! \uD83E\uDDFC");
        }
        care += 3;
        love -= 2;
        tick();
        checkLimits();

    }

    public void makeSound() {
        System.out.println("Din Tamagotchi siger en lyd!"); //bruges kun hvis dyret ikke har sin egen lyd
    }

    public void play(int playInput) {
        System.out.println("Tamagotchi leger alverdens lege lige nu.");
        energy -= 3;
        hunger -= 2;
        care -= 3;
        love += 3;
        tick();

    }

    public void status() {
        System.out.println("Alder: " + age +"\n" + "Energiniveau: " + energy +"\n" + "Sult: " + hunger
        +"\n" + "Kærlighed: " + love + "\n" + "Pleje: " + care);
    }
    public void checkLimits() { //Tjekker om variabler holdes inden for fastsat grænse
        this.care = Math.min(10, Math.max(0, this.care)); //Tager det mindste tal af 100 og det største tal af 0)
        this.hunger = Math.min(10, Math.max(0, this.hunger));
        this.love = Math.min(10, Math.max(0, this.love));
        this.energy = Math.min(10, Math.max(0, this.energy));
    }

    public String getName() {
        return name;
    }
    public String getEnergy() {
        return "Energiniveauet er nu på " + energy;
    }
    public String getLove() {
        return "og den elsker dig " + love + "/10 ❤";
    }
    public String getCare() {
        return "Renligheden er nu på " + care;
    }
    public String getHunger() {
        return "Sulten er nu på " + hunger;
    }
    public int getAge() {
        return age;
    }

    }




