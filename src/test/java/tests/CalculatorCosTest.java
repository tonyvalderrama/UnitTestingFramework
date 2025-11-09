package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorCosTest extends BaseClass {
    @Test(dataProvider = "cosData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing calculating cosine")
    public void testCos(Double angle, Double result) {
        // The cos method has an error in the Jar file class... it returns Math.sin instead of Math.cos
        Assert.assertEquals(calc.cos(angle),result,0.000001,"Cosine calculation failed");
    }

}
