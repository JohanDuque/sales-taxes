import com.johanduke.sales.models.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

    List<BasketItem> basketItems = new ArrayList<>();

    public void addItem(int quantity, Item item){
        basketItems.add(new BasketItem(quantity, item));
    }

}
