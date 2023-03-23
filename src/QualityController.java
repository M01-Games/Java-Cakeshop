public class QualityController extends Employee {
    public QualityController(String name, int cakesCovered) {
        super(name, cakesCovered);
    }

    @Override
    public double calculateWages() {
        double wage = super.calculateWages() * 1.12;
         return wage;
    }
}