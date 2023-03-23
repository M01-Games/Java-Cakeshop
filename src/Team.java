import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Team {
    private List<Employee> employees;

    public Team(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getTotalCakesCovered() {
        int totalCakesCovered = 0;
        for (Employee employee : employees) {
            totalCakesCovered += employee.getCakesCovered();
        }
        return totalCakesCovered;
    }

    public double getTotalWages() {
        double totalWages = 0;
        for (Employee employee : employees) {
            totalWages += employee.calculateWages();
        }
        return totalWages;
    }

    public void displaySummary() {
        // Display table of team summary                                                                                        SPLIT ALL THIS INTO DIFFERENT METHODS!!!!!
        System.out.printf("\nTeam summary:\n");
        System.out.printf("| %-10s | %-15s | %-15s |\n", "Employee", "Cakes Covered", "Wages");
        System.out.println("+------------+-----------------+-----------------+");
        for (Employee employee : employees) {
            String employeeName = employee instanceof QualityController ? "QC " + employee.getName() : employee.getName();
            System.out.printf("| %-10s | %-15d | £%-14.2f |\n", employeeName, employee.getCakesCovered(), employee.calculateWages());
        }
        System.out.println("+------------+-----------------+-----------------+");

        // Display total cakes covered and total wages
        System.out.printf("Total cakes covered: %d\n", getTotalCakesCovered());
        System.out.printf("Total wages: £%.2f\n", getTotalWages());
    }

    public void sortEmployees() {
        // Sort employees by cakes covered (descending), then by name (ascending)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int result = Integer.compare(e2.getCakesCovered(), e1.getCakesCovered());
                if (result == 0) {
                    result = e1.getName().compareTo(e2.getName());
                }
                return result;
            }
        });
    }
}
