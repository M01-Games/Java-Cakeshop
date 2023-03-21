public class QualityController extends Employee {
    private static final double QCbonus = 0.12;

    public QualityController(String name, int cakesCovered) {
        super(name, cakesCovered);
    }

    @Override
    public double calculateWages() {
        double wage = super.calculateWages();
        double bonus = wage * QCbonus;
        return wage + bonus;
    }
}