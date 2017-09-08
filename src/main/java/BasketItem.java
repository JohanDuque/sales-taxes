import com.johanduke.sales.models.Item;
import com.johanduke.sales.models.ItemCategory;

public class BasketItem {

    private int quantity;
    private Item item;
    private double totalPrice;

    public BasketItem(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public Item getItem() {
        return item;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isTaxable(){
        return this.item.getCategory() == ItemCategory.ANY_GOOD;
    }

    public boolean isImported(){
        return this.item.isImported();
    }
}
