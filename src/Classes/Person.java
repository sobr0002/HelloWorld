package Classes;

public class Person {

//Du skal lave en Person klasse der kan indeholde en persons navne og aldre.

    String firstName;
    String lastName;
    String middleName;
    int age;

    public Person(String firstName, String lastName, String middleName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }
//Lav en toString() metode, der returnerer en string med det fulde navn og alder.
    public String toString() {
    return this.firstName + " " + this.middleName + " " + this.lastName + " " + this.age;
    }
}





