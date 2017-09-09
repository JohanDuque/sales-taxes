import com.johanduke.sales.models.Item;
import com.johanduke.sales.models.ItemCategory;

public class BasketItem {

    private int quantity;
    private Item item;

    public BasketItem(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public double getTotalPrice() {
        return calculateTotalPrice();
    }

    public double getTotalTaxes() {
        return calculateTotalPrice() - item.getPrice();
    }

    public String getItemName() { return item.getName(); }

    public int getQuantity() {  return quantity; }

    private boolean isTaxable(){
        return this.item.getCategory() == ItemCategory.ANY_GOOD;
    }

    private boolean isImported(){
        return this.item.isImported();
    }

    protected double calculateTotalPrice() {
        double totalPrice = item.getPrice();

        if (isImported()){
            totalPrice += TaxesCalculator.calculateImportDuty(item.getPrice());
        }
        if (isTaxable()){
            totalPrice += TaxesCalculator.calculateTaxes(item.getPrice());
        }
        return totalPrice * quantity;
    }

}
