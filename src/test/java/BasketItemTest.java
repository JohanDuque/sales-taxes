import com.johanduke.sales.models.Item;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class BasketItemTest {

    @Test
    public void getTotalPriceOfABasketItemWithNoPriceReturnsZero() throws Exception {
        BasketItem basketItem = new BasketItem(1, new Item());
        assertEquals(0, basketItem.getTotalPrice(), 0);
    }

    @Test
    public void getTotalPriceOfAnyNumberBasketItemsWithNoPriceReturnsZero() throws Exception {
        BasketItem basketItem = new BasketItem(new Random().nextInt(100), new Item());
        assertEquals(0, basketItem.getTotalPrice(), 0);
    }

    @Test
    public void getTotalPriceOfAnImportedBasketItemWithAPriceAddsFifteenPercentToTheTotalPrice() throws Exception {
        BasketItem basketItem = new BasketItem(1, new Item(true, "any good", 100));
        assertEquals(115, basketItem.getTotalPrice(), 0);
    }
}