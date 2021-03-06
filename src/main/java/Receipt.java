
public class Receipt {

    private ShoppingBasket shoppingBasket;
    private double salesTaxes;
    private double total;
    private String printedReceipt = "";

    public Receipt(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
        elaborateReceipt();

    }

    private void elaborateReceipt() {
        for ( BasketItem basketItem : shoppingBasket.getBasketItems() ) {
            salesTaxes += basketItem.getTotalTaxes();
            total += basketItem.getTotalPrice();
            printedReceipt += basketItem.getQuantity() + " " + basketItem.getItemName()  + ": " +basketItem.getTotalPrice() + "\n";
        }

        total = TaxesCalculator.plainRound(total);
        salesTaxes = TaxesCalculator.plainRound(salesTaxes);

        printedReceipt += "Sales Taxes: " + salesTaxes + "\n";
        printedReceipt += "Total: " + total;
    }

    public String getPrintedReceipt() {
        return printedReceipt;
    }

    public double getSalesTaxes() {
        return salesTaxes;
    }

    public double getTotal() {
        return total;
    }
}
