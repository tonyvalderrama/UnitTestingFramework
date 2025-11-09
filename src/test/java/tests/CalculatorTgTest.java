package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import templates.BaseClass;
import templates.TestDataProvider;

public class CalculatorTgTest extends BaseClass {

    @Test(dataProvider = "tgData",
            dataProviderClass = TestDataProvider.class,
            testName = "Testing calculating tangent")
    public void testTg(Double angle, Double result) {
        // All fail because in the Jar file, the cos function...
        // ...returns Math.sin()... I guess their mistake... or not
        Assert.assertEquals(calc.tg(angle),result,0.000001,"Tangent calculation failed");
    }

}
