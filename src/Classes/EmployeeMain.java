package Classes;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee jubii = new Employee("Tut", "Hansen", 0);

        jubii.yearlySalary();

        System.out.println(jubii);

        jubii.yearlySalaryRaise();


    }
}
