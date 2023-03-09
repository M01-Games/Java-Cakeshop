import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CakeShop {
    public static void main(String[] args) {
        // Create employees and add them to a list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Andrew", 162));
        employees.add(new Employee("Hafsa", 34));
        employees.add(new Employee("Ayub", 193));
        employees.add(new Employee("Amaan", 309));
        employees.add(new Employee("Gary", 49));
        employees.add(new Employee("Diane", 217));
        employees.add(new QualityController("Rabia", 385));

        // Display employee details in a table
        System.out.println("+------------+--------+----------+");
        System.out.println("| Employee   | Cakes  | Wages    |");
        System.out.println("+------------+--------+----------+");
        employees.stream()
            .sorted(Comparator.comparing(Employee::getNumCakes).reversed().thenComparing(Employee::getName))
            .forEach(System.out::println);
        System.out.println("+------------+--------+----------+");

        // Display team performance summary
        int totalCakes = employees.stream().mapToInt(Employee::getNumCakes).sum();
        double totalWages = employees.stream().mapToDouble(Employee::calculateWages).sum();
        System.out.printf("Total cakes covered: %d\n", totalCakes);
        System.out.printf("Total wages to be paid: £%.2f\n", totalWages);
    }
}