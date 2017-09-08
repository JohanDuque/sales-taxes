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
    public void applyImportDutyToABasketItemWithNoPriceLeftTheItemUnmodified() throws Exception {
        BasketItem basketItem = new BasketItem(1, new Item());
        TaxesCalculator.applyImportDuty(basketItem);
        assertEquals(0, basketItem.getTotalPrice(), 0);
    }

    @Test
    public void applyImportDutyToAnImportedBasketItemWithAPriceAddsFivePercentToTheTotalPrice() throws Exception {
        BasketItem basketItem = new BasketItem(1, new Item(true, "any good", 100));
        TaxesCalculator.applyImportDuty(basketItem);
        assertEquals(105, basketItem.getTotalPrice(), 0);
    }

}