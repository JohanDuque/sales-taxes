import com.johanduke.sales.models.Item;

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
}
