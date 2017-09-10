import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxesCalculator {

    private static final double IMPORT_DUTY_PERCENTAGE = 0.05;
    private static final double GOOD_TAXES_PERCENTAGE = 0.10;
    private static final int DECIMAL_PLACES = 2;

    protected static double calculateTaxes(double netPrice) {
        return round(netPrice * GOOD_TAXES_PERCENTAGE);
    }

    protected static double calculateImportDuty(double netPrice) {
        return round(netPrice * IMPORT_DUTY_PERCENTAGE);
    }

    protected static double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(DECIMAL_PLACES, RoundingMode.HALF_UP);
        double rounded = bd.doubleValue();

        return rounded;
    }

}
