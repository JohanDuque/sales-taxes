import com.johanduke.sales.models.Item;
import com.johanduke.sales.models.ItemCategory;
import org.junit.Before;
import org.junit.Test;

public class ReceiptTest {

    ShoppingBasket shoppingBasket;
    Receipt receipt;

    @Before
    public void createNewShoppingBasket(){
        shoppingBasket = new ShoppingBasket();
    }

    @Test
    public void testInputOne(){
/*
        Input 1:
        1 book at 12.49
        1 music CD at 14.99
        1 chocolate bar at 0.85
*/
        shoppingBasket.addItem(1, new Item(ItemCategory.BOOKS, "book", 12.49));
        shoppingBasket.addItem(1, new Item("music CD", 14.99));
        shoppingBasket.addItem(1, new Item(ItemCategory.FOOD, "chocolate bar", 0.85));

        receipt = new Receipt(shoppingBasket);
        System.out.println(receipt.getPrintedReceipt());
        System.out.println();

    }

    @Test
    public void testInputTwo(){
/*
        Input 2:
        1 imported box of chocolates at 10.00
        1 imported bottle of perfume at 47.50
*/
        shoppingBasket.addItem(1, new Item(true, ItemCategory.FOOD, "imported box of chocolates", 10.00));
        shoppingBasket.addItem(1, new Item(true, "imported bottle of perfume", 47.50));

        receipt = new Receipt(shoppingBasket);
        System.out.println(receipt.getPrintedReceipt());
        System.out.println();

    }

    @Test
    public void testInputThree(){
/*
        Input 3:
        1 imported bottle of perfume at 27.99
        1 bottle of perfume at 18.99
        1 packet of headache pills at 9.75
        1 box of imported chocolates at 11.25
*/
        shoppingBasket.addItem(1, new Item(true, "imported bottle of perfume", 27.99));
        shoppingBasket.addItem(1, new Item("bottle of perfume", 18.99));
        shoppingBasket.addItem(1, new Item(ItemCategory.MEDICAL, "packet of headache pills", 9.75));
        shoppingBasket.addItem(1, new Item(true, ItemCategory.FOOD, "imported box of chocolates", 11.25));

        receipt = new Receipt(shoppingBasket);
        System.out.println(receipt.getPrintedReceipt());
        System.out.println();

    }


}