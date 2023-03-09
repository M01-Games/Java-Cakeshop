import java.math.BigDecimal;

public class QualityController extends Employee {
    private static final BigDecimal QUALITY_CONTROL_BONUS = new BigDecimal(0.12);

    public QualityController(String name, int cakesCovered, BigDecimal wageRate) {
        super(name, cakesCovered, wageRate);
    }

    @Override
    public BigDecimal calculateWages() {
        BigDecimal wage = super.calculateWages();
        BigDecimal bonus = wage.multiply(QUALITY_CONTROL_BONUS);
        return wage.add(bonus).setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
