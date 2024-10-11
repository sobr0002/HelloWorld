package Classes;

public class DateMain {
    public static void main(String[] args) {

        // Med parameterized constructor
        Date birthday1 = new Date(28, 8, 1995);

        System.out.println(birthday1);

        // Med default constructor
        Date birthday2 = new Date();
        birthday2.setBirthday(28, 8, 1995);
        System.out.println(birthday2);

    }
}
