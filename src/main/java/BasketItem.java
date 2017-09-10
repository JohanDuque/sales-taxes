import com.johanduke.sales.models.Item;
import com.johanduke.sales.models.ItemCategory;

public class BasketItem {

    private int quantity;
    private Item item;
    private double totalPrice = -1;

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
        if(totalPrice == -1) {
            this.totalPrice = item.getPrice();

            if (isImported()) {
                totalPrice += TaxesCalculator.calculateImportDuty(item.getPrice());
            }
            if (isTaxable()) {
                totalPrice += TaxesCalculator.calculateTaxes(item.getPrice());
            }
            return TaxesCalculator.round(totalPrice * quantity);
        }else{
            return TaxesCalculator.round(this.totalPrice);
        }
    }

}
