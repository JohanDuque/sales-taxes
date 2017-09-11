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
        assertEquals(1.70, actual, 0);
    }

    @Test
    public void roundByZeroPointZeroFiveAnyDecimalNumber(){
        double rounded = TaxesCalculator.roundUp(23.3635);
        assertEquals(23.40, rounded, 0);

        rounded = TaxesCalculator.roundUp(23.355);
        assertEquals(23.40, rounded, 0);

        rounded = TaxesCalculator.roundUp(23.3965);
        assertEquals(23.40, rounded, 0);

        rounded = TaxesCalculator.roundUp(23.3965);
        assertEquals(23.40, rounded, 0);

        rounded = TaxesCalculator.roundUp(23.3665);
        assertEquals(23.40, rounded, 0);

        rounded = TaxesCalculator.roundUp(1352.281743);
        assertEquals(1352.30, rounded, 0);

        rounded = TaxesCalculator.roundUp(28.206);
        assertEquals(28.25, rounded, 0);

        rounded = TaxesCalculator.roundUp(0.5625);
        assertEquals(0.60, rounded, 0);

    }


}