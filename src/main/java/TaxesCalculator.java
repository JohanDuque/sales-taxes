public class TaxesCalculator {

    public static final double IMPORT_DUTY_PERCENTAGE = 5;

    public static void setTotalPrice(BasketItem basketItem){
        if(basketItem.getItem().isImported()){
            applyImportDuty(basketItem);
        }
        //return item;
    }

    protected static void applyImportDuty(BasketItem basketItem) {
        double itemPrice = basketItem.getItem().getPrice();
        //I want to be sure that itemPrice is positive to avoid negative numbers and division by zero
        double importDuty = itemPrice > 0 ? IMPORT_DUTY_PERCENTAGE / itemPrice * 100 : 0;

        basketItem.setTotalPrice(itemPrice + importDuty);
    }


}
