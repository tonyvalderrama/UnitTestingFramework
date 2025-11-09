package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorMultDoubleTest extends BaseClass {

    @Test(dataProvider = "multiplicationDataDouble",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing multiplication with Double values")
    public void testDoubleMult(Double x, Double y, Double result) {
        Assert.assertEquals(calc.mult(x,y),result,"\n Problems multiplying two double values\n");
    }

}
