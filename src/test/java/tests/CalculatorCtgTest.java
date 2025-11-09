package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorCtgTest extends BaseClass {

    @Test(dataProvider = "ctgData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing calculating hyperbolic tangent")
    public void testCtg(Double angle, Double result) {
        Assert.assertEquals(calc.ctg(angle),result,0.0001,"Hyperbolic tangent calculation failed");
    }

}
