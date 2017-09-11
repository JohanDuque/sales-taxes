import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxesCalculator {

    private static final double IMPORT_DUTY_PERCENTAGE = 0.05;
    private static final double GOOD_TAXES_PERCENTAGE = 0.10;
    private static final int DECIMAL_PLACES = 2;
    public static final double ROUND_INCREMENT_VALUE = 0.01;

    protected static double calculateTaxes(double netPrice) {
        return roundUp(netPrice * GOOD_TAXES_PERCENTAGE);
    }

    protected static double calculateImportDuty(double netPrice) {
        return roundUp(netPrice * IMPORT_DUTY_PERCENTAGE);
    }

    protected static double plainRound(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(DECIMAL_PLACES, RoundingMode.HALF_UP);
        double rounded = bd.doubleValue();

        return rounded;
    }


    protected static double roundUp(double value) {
        double rounded = Math.round(value * 20)/20.0;

        if(rounded < value){
            return roundUp(value += ROUND_INCREMENT_VALUE);
        }else {
            return rounded;
        }
    }



}
