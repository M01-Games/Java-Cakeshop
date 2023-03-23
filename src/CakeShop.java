import java.util.ArrayList;
import java.util.List;

public class CakeShop {
    public static void main(String[] args) {
        // Create employees and add them to a list
        List<Employee> employees = new ArrayList<>();
        Employee bob = new Employee("Bob", 100);
        Employee andrew = new Employee("Andrew", 162);       
        Employee hafsa = new Employee("Hafsa", 34);     
        Employee ayub = new Employee("Ayub", 193);
        Employee amaan = new Employee("Amaan", 309);         
        Employee gary = new Employee("Gary", 49);        
        Employee diane = new Employee("Diane", 217);
        Employee rabia = new QualityController("Rabia", 385);                

        employees.add(bob);
        employees.add(andrew);
        employees.add(hafsa);
        employees.add(ayub);
        employees.add(amaan);
        employees.add(gary);
        employees.add(diane);
        employees.add(rabia);

        Team team = new Team(employees);

        team.sortEmployees();
        team.displaySummary();

        bob.addCakes(0);
        bob.subtractCakes(6);

        andrew.addCakes(32);
        andrew.subtractCakes(16);

        hafsa.addCakes(44);
        hafsa.subtractCakes(21);

        ayub.addCakes(102);
        ayub.subtractCakes(12);

        amaan.addCakes(56);
        amaan.subtractCakes(1);

        gary.addCakes(62);
        gary.subtractCakes(11);

        diane.addCakes(10);
        diane.subtractCakes(2);

        team.sortEmployees();
        team.displaySummary();
    }
}
