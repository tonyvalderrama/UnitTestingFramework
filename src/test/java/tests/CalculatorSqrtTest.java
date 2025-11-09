package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorSqrtTest extends BaseClass {

    @Test(dataProvider = "sqrtData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing square root")
    public void testSqrt(Double x, Double result) {
        Assert.assertEquals(calc.sqrt(x),result,0.00001,"\n   Problems calculating the square root\n");
    }

}
