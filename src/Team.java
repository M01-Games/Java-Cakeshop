import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Team {
    private List<Employee> employees = new ArrayList<>();
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    public void addQualityController(QualityController qualityController) {
        employees.add(qualityController);
    }
    
    public void updateEmployeeCakes(String name, int additionalCakes, int unsuitableCakes) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employee.addCakes(additionalCakes);
                employee.subtractCakes(unsuitableCakes);
                break;
            }
        }
    }
    
    public void printEmployeeDetails() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Name", "Cakes Covered", "Wages", "Type");
        for (Employee employee : employees) {
            String type = employee instanceof QualityController ? "QC" : "Employee";
            double wages = employee.calculateWages();
            System.out.printf("%-15s %-15d %-15s %-15s\n", employee.getName(), employee.getCakesCovered(),
                    "£" + df.format(wages), type);
        }
        System.out.println();
    }
    
    public void printTeamStatistics() {                     //split up in to individual methods - 1 job to 1 method
        int totalCakesCovered = 0;
        double totalWages = 0;
        for (Employee employee : employees) {
            totalCakesCovered += employee.getCakesCovered();
            totalWages += employee.calculateWages();
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Team Performance:");
        System.out.println("Total Cakes Covered: " + totalCakesCovered);
        System.out.println("Total Wages: £" + df.format(totalWages));
    }
    
    public void sortEmployeesByCakesCovered() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (emp1.getCakesCovered() == emp2.getCakesCovered()) {
                    return emp1.getName().compareTo(emp2.getName());
                } else {
                    return emp2.getCakesCovered() - emp1.getCakesCovered();
                }
            }
        });
    }
}
