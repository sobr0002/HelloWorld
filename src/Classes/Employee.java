package Classes;
/* Your class should have a constructor that initializes the three instance variables.
If the monthly salary is not positive, set it to 0.0. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */
public class Employee {

    String name;
    String lastName;
    double salary;


    public Employee(String name, String lastName, double salary) {

        this.name = name;
        this.lastName = lastName;
        this.salary = salary;

    }
    public double yearlySalary() {

        if (salary < 0) {
            return 0.0;
        }
        return salary * 12;
    }

    public double yearlySalaryRaise() {
            return yearlySalary() + (1.1 * salary);
        }

        public String toString() {
            return "Greetings " + name + " " + lastName + "!" + "\n" +
                    "Your yearly salary is with a raise of 10 %: " + yearlySalaryRaise() + " kr.";
        }

    }

