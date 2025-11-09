package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorSinTest extends BaseClass {

    @Test(dataProvider = "sinData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing calculating sine")
    public void testSin(Double angle, Double result) {
        Assert.assertEquals(calc.sin(angle),result,0.000001,"Sine calculation failed");
    }

}
