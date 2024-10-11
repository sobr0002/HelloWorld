package Classes;

public class Date {

    int day;
    int month;
    int year;

    //Default constructor
    public Date(){
        day = 0;
        month = 0;
        year = 0;
    }
    //Parameterized constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }
    public void setBirthday(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return "Date of birthday: " + "\n" +
                "Day: " + day + "\n" +
                "Month: " + month + "\n" +
                "Year: " + year;
    }


}
