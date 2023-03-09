import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee {
    private String name;
    private int cakesCovered;
    private BigDecimal wageRate;

    public Employee(String name, int cakesCovered, BigDecimal wageRate) {
        this.name = name;
        this.cakesCovered = cakesCovered;
        this.wageRate = wageRate;
    }

    public String getName() {
        return name;
    }

    public int getCakesCovered() {
        return cakesCovered;
    }

    public BigDecimal getWageRate() {
        return wageRate;
    }

    public BigDecimal calculateWages() {
        BigDecimal wage = BigDecimal.ZERO;
        int cakes = cakesCovered;
        if (cakes > 50) {
            wage = wage.add(new BigDecimal(50).multiply(wageRate));
            cakes -= 50;
            wage = wage.add(new BigDecimal(cakes).multiply(wageRate.add(new BigDecimal(0.05))));
        } else {
            wage = wage.add(new BigDecimal(cakes).multiply(wageRate));
        }
        return wage.setScale(2, RoundingMode.HALF_UP);
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
            cakesCovered -= cakes;
        } else {
            System.out.println("Invalid number of cakes.");
        }
    }
}
