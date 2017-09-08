import com.johanduke.sales.models.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxesCalculatorTest {

    @Test
    public void setTotalPriceToABasketItemWithNoPriceLeftTheItemUnmodified() throws Exception {
        BasketItem basketItem = new BasketItem(1, new Item());
        TaxesCalculator.setTotalPrice(basketItem);
        assertEquals(0, basketItem.getTotalPrice(), 0);
    }

    @Test
    public void appliesImportDutyToABasketItemWithNoPriceLeftTheItemUnmodified() throws Exception {
        BasketItem basketItem = new BasketItem(1, new Item());
        TaxesCalculator.applyImportDuty(basketItem);
        assertEquals(0, basketItem.getTotalPrice(), 0);
    }

    @Test
    public void appliesImportDutyToAnImportedBasketItemWithAPriceAddsFivePercentToTheTotalPrice() throws Exception {
        BasketItem basketItem = new BasketItem(1, new Item(true, "any good", 100));
        TaxesCalculator.applyImportDuty(basketItem);
        assertEquals(105, basketItem.getTotalPrice(), 0);
    }

    @Test
    public void roundByZeroPointZeroFiveAnyDecimalNumber(){
        double rounded = TaxesCalculator.round(23.3635);
        assertEquals(23.36, rounded, 0);

        rounded = TaxesCalculator.round(23.3665);
        assertEquals(23.37, rounded, 0);

        rounded = TaxesCalculator.round(1352.281743);
        assertEquals(1352.28, rounded, 0);

        rounded = TaxesCalculator.round(28.206);
        assertEquals(28.21, rounded, 0);

    }


}