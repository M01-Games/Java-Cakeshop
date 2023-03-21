public class Employee {
    private String name;
    private int cakesCovered;

    public Employee(String name, int cakesCovered) {
        this.name = name;
        this.cakesCovered = cakesCovered;
    }

    public String getName() {
        return name;
    }

    public int getCakesCovered() {
        return cakesCovered;
    }

    public void setCakesCovered(int cakesCovered) {
        this.cakesCovered = cakesCovered;
    }

    public double calculateWages() {
        double wages;
        if (cakesCovered <= 50) {
            wages = cakesCovered * 0.1;
        } else {
            wages = (50 * 0.1) + ((cakesCovered - 50) * 0.15);
        }
        return wages;
    }


    public void addCakes(int cakes) {
        if (cakes >= 0) {
            cakesCovered += cakes;
        } else {
            System.out.println("Invalid number of cakes.");
        }
    }

    public void subtractCakes(int cakes) {
        if (cakes >= 0 && cakes <= cakesCovered) {
            cakesCovered -= cakes * 2;
        } else {
            System.out.println("Invalid number of cakes.");
        }
    }
}
