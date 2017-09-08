import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxesCalculator {

    public static final double IMPORT_DUTY_PERCENTAGE = 0.05;
    public static final int DECIMAL_PLACES = 2;

    public static void setTotalPrice(BasketItem basketItem){
        if(basketItem.isImported()){
            applyImportDuty(basketItem);
        }
        if(basketItem.isTaxable()){
            applyTaxes(basketItem);
        }
    }
//TODO refactor, use doubles instead of void, move logit to Basket
    protected static void applyTaxes(BasketItem basketItem) {

    }

    protected static void applyImportDuty(BasketItem basketItem) {
        double itemPrice = basketItem.getItem().getPrice();
        double importDuty = itemPrice * IMPORT_DUTY_PERCENTAGE;

        basketItem.setTotalPrice(itemPrice + importDuty);
    }

    protected static double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(DECIMAL_PLACES, RoundingMode.HALF_UP);

        return bd.doubleValue();
    }
}
