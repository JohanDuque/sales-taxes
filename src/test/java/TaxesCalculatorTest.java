import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxesCalculatorTest {

    @Test
    public void calculateImportDutyToAZeroNetPriceReturnsZero() throws Exception {
        double actual = TaxesCalculator.calculateImportDuty(0);
        assertEquals(0, actual, 0);
    }

    @Test
    public void calculateImportDutyToAPositivenNetPriceRetunrPricePlusFivePrecent() throws Exception {
        double actual = TaxesCalculator.calculateImportDuty(33);
        assertEquals(1.65, actual, 0);
    }

    @Test
    public void roundByZeroPointZeroFiveAnyDecimalNumber(){
        double rounded = TaxesCalculator.round(23.3635);
        assertEquals(23.36, rounded, 0);

        rounded = TaxesCalculator.round(23.3665);
        assertEquals(23.37, rounded, 0);

        rounded = TaxesCalculator.round(1352.281743);
        assertEquals(1352.28, rounded, 0);

        rounded = TaxesCalculator.round(28.206);
        assertEquals(28.21, rounded, 0);

    }


}