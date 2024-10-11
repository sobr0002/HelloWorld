package Classes;

public class Dog {
/*
Create a Dog class. The class should have 4 attributes that you choose
1 method that you choose
Create 2 instances of dogs using the constructor!
Now call the method on the two dog objects.
*/
    String name;
    double weight;
    int age;
    boolean cute = true;

    public Dog(String name, double weight, int age, boolean cute) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.cute = cute;

    }
    public String bark() {

        if (cute == true) {
            return "Vuffeli glad vovhund";
        }
        else if (cute == false) {
            return "Not glad vuffeli vovhund";
        }
        return "Så er jeg bare en nullermand";

    }

    public String toString () {
        return " hedder " + name + "\n" +
                "Den er " + age + " år og vejer " + weight + " kg" + "\n" +
                "Er den mon sød? " + cute;

    }



}
