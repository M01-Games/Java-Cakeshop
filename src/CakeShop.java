import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CakeShop {
    public static void main(String[] args) {
        // Create employees and add them to a list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob", 100));
        employees.add(new Employee("Andrew", 162));
        employees.add(new Employee("Hafsa", 34));
        employees.add(new Employee("Ayub", 193));
        employees.add(new Employee("Amaan", 309));
        employees.add(new Employee("Gary", 49));
        employees.add(new Employee("Diane", 217));
        employees.add(new QualityController("Rabia", 385));
        Team team = new Team(employees);

        employees.get(0).addCakes(0);
        employees.get(0).subtractCakes(6);

        employees.get(1).addCakes(32);
        employees.get(1).subtractCakes(16);

        employees.get(2).addCakes(44);
        employees.get(2).subtractCakes(21);

        employees.get(3).addCakes(102);
        employees.get(3).subtractCakes(12);

        employees.get(4).addCakes(56);
        employees.get(4).subtractCakes(1);

        employees.get(5).addCakes(62);
        employees.get(5).subtractCakes(11);

        employees.get(6).addCakes(10);
        employees.get(6).subtractCakes(2);

        team.sortEmployees();
        team.displaySummary();
    }
}
